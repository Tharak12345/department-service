package com.looser.departmentservice.Exception;

import org.springframework.stereotype.Component;

@Component
public class ControllerException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String errorCode;
	public ControllerException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	private String errorMessage;
	
    public  ControllerException() {
    	
    }

}
