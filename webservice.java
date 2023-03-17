package com.springrestapi.springrestapi.controller;

public class webservice {
    private String  name;
	private String  university;
    private String  course;
	private String  Stream;
	private String  curren_status;
    private String  task;
	
	public webservice(String name, String University, String course, String Stream, String current_Status, String task)
	{
		super();
		this.name = name;
		this.university = University;
        this.course = course;
		this.Stream = Stream;
		this.curren_status = current_Status;
        this.task = task;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

    public String getcourse() {
		return course;
	}
	public void setcourse(String course) {
		this.course = course;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String Stream) {
		this.Stream = Stream;
	}

	public String getCurren_status() {
		return curren_status;
	}

	public void setCurren_stateus(String curren_status) {
		this.curren_status = curren_status;
	}

    public String gettask() {
        return task;
    }

    public void settask(String task) {
        this.task = task;
    }
    
}
