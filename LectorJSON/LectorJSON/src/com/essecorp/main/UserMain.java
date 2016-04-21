package com.essecorp.main;

import com.essecorp.objectvalue.RegistroVO;
import com.essecorp.objectvalue.UserVO;

public class UserMain {
	
	public static List<String> LeerArchivo(String nombreArchivo) {
		System.out.println("Ingresa a LeerArchivo");
		String actual="";
		FileReader fr = null;
        
		List<String> registrosFiltro = new ArrayList<String>();
		
		try {
        	fr = new FileReader(nombreArchivo);
            BufferedReader entrada = new BufferedReader(fr);
            String problem_check = "\"name\": \"problem_check\"";
            String play_video = "\"name\": \"play_video\"";
            String stop_video = "\"name\": \"stop_video\"";
            String edx_forum_thread = "\"name\": \"edx.forum.thread.create\"";
            String edx_forum_response = "\"name\": \"edx.forum.response.create\"";
            String edx_forum_comment = "\"name\": \"edx.forum.comment.create\"";
            while ((actual = entrada.readLine()) != null) {
            	if (actual.contains(problem_check) || actual.contains(play_video) || actual.contains(stop_video) || actual.contains(edx_forum_thread) || actual.contains(edx_forum_response) || actual.contains(edx_forum_comment)) {
            		registrosFiltro.add(actual);
            	}
			}
            entrada.close();
            System.out.println("Se ha leído el archivo " + nombreArchivo + " con éxito");
        } catch (Exception e) {
        	e.printStackTrace();
        	System.out.println("Se ha presentado una excepción al leer el archivo de versiones");
		}
		
		return registrosFiltro;
	}
	
	public static List<UserVO> consultarRegistros (List<String> registros) {
		List<UserVO> usersVO = new ArrayList<UserVO>();
		for (int i = 0; i < registros.size(); i ++) {
			UserVO userVO = new UserVO();
			String registro = registros.get(i).substring(2, registros.get(i).length()-2);
			registro = registro.replace("\"context\": {", "");
			registro = registro.replace("},", ",");
			registro = registro.replace("\": \"", ":");
			registro = registro.replace("\", \"", ", ");
			
			String[] elementos = registro.split(", ");
			userVO.setUsername(elementos[0].substring(9, elementos[0].length()));
			userVO.setName(elementos[2].substring(5, elementos[2].length()));
			userVO.setTime(elementos[4].substring(5, elementos[4].length()));
			userVO.setReferer(elementos[9].substring(8, elementos[9].length()));
			userVO.setCourse_id(elementos[12].substring(10, elementos[12].length()));
			userVO.setUser_id(elementos[10].substring(10, elementos[10].length()));
			userVO.setEvent_type(elementos[elementos.length-1].substring(11, elementos[elementos.length-1].length()));
			
			usersVO.add(userVO);
		}
		
		return usersVO;
		
	}
	
	public static void organizarRegistros (List<UserVO> usuarios) {
		RegistroVO registroVO = new RegistroVO();
		List<RegistroVO> registros = new ArrayList<RegistroVO>();
		String username;
		int video_check;
		int video_complete;
		int forum_created;
		int forum_response;
		int forum_commented;
		int problem_check;
		
		
		
	}	
	
	public static void main(String[] args) {
		List<UserVO> users = new ArrayList<UserVO>();
		String archivo = "D:/tracking.log";
		List<String> contenido = LeerArchivo(archivo);
		System.out.println("Cantidad de registros: " + contenido.size());
		
		users = consultarRegistros(contenido);
		
		for (int i = 0; i < users.size(); i ++) {
			System.out.println("username: " + users.get(i).getUsername() + " - name: " + users.get(i).getName() + " - time: " + users.get(i).getTime() + " - referer: " + users.get(i).getReferer() + " - course_id: " + users.get(i).getCourse_id() + " - user_id: " + users.get(i).getUser_id() + " - event_type: " + users.get(i).getEvent_type());
		}
		
		Collections.sort(users, new Comparator<UserVO>(){
			@Override
			public int compare(UserVO u1, UserVO u2) {
				return u1.getUser_id().compareTo(u2.getUser_id());
			}
		});
		System.out.println("-----------------------ORDENADAS-----------------------");
		for (int i = 0; i < users.size(); i ++) {
			System.out.println("username: " + users.get(i).getUsername() + " - name: " + users.get(i).getName() + " - time: " + users.get(i).getTime() + " - referer: " + users.get(i).getReferer() + " - course_id: " + users.get(i).getCourse_id() + " - user_id: " + users.get(i).getUser_id() + " - event_type: " + users.get(i).getEvent_type());
		}
		
		
	}
	
}
