package com.books;

public class InvalidBookException extends Exception {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public InvalidBookException(String msg) {
		super();
		this.msg = msg;
	}

	public InvalidBookException() {
		super();
	}
	
	}
