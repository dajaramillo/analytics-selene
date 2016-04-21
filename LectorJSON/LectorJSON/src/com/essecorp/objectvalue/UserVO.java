package com.essecorp.objectvalue;

public class UserVO {
	
	private String username;
	private String name;
	private String time;
	private String referer;
	private String course_id;
	private String user_id;
	private String event_type;
	
	public UserVO() {
		super();
	}
	public UserVO(String username, String name, String time, String referer, String course_id, String user_id,
			String event_type) {
		super();
		this.username = username;
		this.name = name;
		this.time = time;
		this.referer = referer;
		this.course_id = course_id;
		this.user_id = user_id;
		this.event_type = event_type;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getReferer() {
		return referer;
	}
	public void setReferer(String referer) {
		this.referer = referer;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	
}
