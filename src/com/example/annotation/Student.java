package com.example.annotation;

import java.io.Serializable;

import com.example.annotation.ValueBind.fieldType;

public class Student implements Serializable{

	/** 
	* @Fields serialVersionUID : 默认序列号 
	*/ 
	
	private static final long serialVersionUID = 1L;

	private String name="";
	
	private int age=0;
	
	private String studentId="";

	public String getName() {
		return name;
	}

	@ValueBind(value="aa")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@ValueBind(type=fieldType.INT,value="30")
	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentId() {
		return studentId;
	}

	@ValueBind(type=fieldType.STRING,value="101")
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
}
