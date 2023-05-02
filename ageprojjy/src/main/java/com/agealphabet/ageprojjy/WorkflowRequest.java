package com.agealphabet.ageprojjy;

import java.io.Serializable;

public class WorkflowRequest implements Serializable {
	private int age;
	private String name;

	private java.util.List<java.lang.String> punn;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkflowRequest() {

	}

	public java.util.List<java.lang.String> getPunn() {
		return this.punn;
	}

	public void setPunn(java.util.List<java.lang.String> punn) {
		this.punn = punn;
	}

	public WorkflowRequest(int age, java.lang.String name,
			java.util.List<java.lang.String> punn) {
		this.age = age;
		this.name = name;
		this.punn = punn;
	}
}
