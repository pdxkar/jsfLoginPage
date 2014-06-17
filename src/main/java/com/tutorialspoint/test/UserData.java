package com.tutorialspoint.test;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String password;

	private String response2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResponse2() {
		return response2;
	}

	public void setResponse2(String response2) {
		this.response2 = response2;
	}

	public String login() {
		System.out.println("in login method");
	//	return "response";
		setResponse2(getName());
		return response2;
	}
}