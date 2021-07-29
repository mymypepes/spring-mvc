package com.example.response.admin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateUserResponse {
	@JsonProperty("result_mess")
	private String resultMess;
	@JsonProperty("result_code")
	private String resultCode;
	
	public String getResultMess() {
		return resultMess;
	}
	public void setResultMess(String resultMess) {
		this.resultMess = resultMess;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
}
