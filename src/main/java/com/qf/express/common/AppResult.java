package com.qf.express.common;


//json 返回类
public class AppResult {

	//返回码：200 正常  200以外都不正常
	private Integer keyCode;
	//返回信息
	private String message;
	//返回的数据
	private Object data;
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
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public AppResult() {
		// TODO Auto-generated constructor stub
	}
	public AppResult(Integer keyCode, String message, Object data) {
		super();
		this.keyCode = keyCode;
		this.message = message;
		this.data = data;
	}
	
	
}
