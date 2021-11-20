package com.bridgelabz.userapplication.response;

import org.springframework.stereotype.Component;

@Component
public class Response {
	private Long statusCode;
	private String message;
	private Object token;

	public Long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(long statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getToken() {
		return token;
	}

	public void setToken(Object token) {
		this.token = token;
	}

	public Response(Long statusCode, String message, Object token) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.token = token;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

}
