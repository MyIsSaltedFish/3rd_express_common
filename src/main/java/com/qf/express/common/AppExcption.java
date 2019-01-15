package com.qf.express.common;

//系统的业务异常
public class AppExcption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4226493681494875005L;
	private Integer keyCode;
	private String message;
	public Integer getKeyCode() {
		return keyCode;
	}
	public void setKeyCode(Integer keyCode) {
		this.keyCode = keyCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public AppExcption() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppExcption(Integer keyCode, String message) {
		super();
		this.keyCode = keyCode;
		this.message = message;
	}
	
	
}
