package com.essecorp.objectvalue;

public class RegistroVO {
	
	private String username;
	private int video_check;
	private int video_complete;
	private int forum_created;
	private int forum_response;
	private int forum_commented;
	private int problem_check;
	
	public RegistroVO() {
		super();
	}
	public RegistroVO(String username, int video_check, int video_complete, int forum_created,
			int forum_response, int forum_commented, int problem_check) {
		super();
		this.username = username;
		this.video_check = video_check;
		this.video_complete = video_complete;
		this.forum_created = forum_created;
		this.forum_response = forum_response;
		this.forum_commented = forum_commented;
		this.problem_check = problem_check;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getVideo_check() {
		return video_check;
	}
	public void setVideo_check(int video_check) {
		this.video_check = video_check;
	}
	public int getVideo_complete() {
		return video_complete;
	}
	public void setVideo_complete(int video_complete) {
		this.video_complete = video_complete;
	}
	public int getForum_created() {
		return forum_created;
	}
	public void setForum_created(int forum_created) {
		this.forum_created = forum_created;
	}
	public int getForum_response() {
		return forum_response;
	}
	public void setForum_response(int forum_response) {
		this.forum_response = forum_response;
	}
	public int getForum_commented() {
		return forum_commented;
	}
	public void setForum_commented(int forum_commented) {
		this.forum_commented = forum_commented;
	}
	public int getProblem_check() {
		return problem_check;
	}
	public void setProblem_check(int problem_check) {
		this.problem_check = problem_check;
	}
	
}
