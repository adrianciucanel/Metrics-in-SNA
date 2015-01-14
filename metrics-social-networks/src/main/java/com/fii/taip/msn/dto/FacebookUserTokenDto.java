package com.fii.taip.msn.dto;

import org.springframework.data.annotation.TypeAlias;

@TypeAlias("token")
public class FacebookUserTokenDto {
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
