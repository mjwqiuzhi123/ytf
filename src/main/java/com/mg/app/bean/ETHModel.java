package com.mg.app.bean;

import org.springframework.stereotype.Component;

@Component
public class ETHModel {
	private String password;
	private String address;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
