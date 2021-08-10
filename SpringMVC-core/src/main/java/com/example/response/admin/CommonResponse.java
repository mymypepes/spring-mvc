package com.example.response.admin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommonResponse {

	@JsonProperty("result_code")
	private String resultCode;
	
	@JsonProperty("result_message")
	private String resultMessage;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	
	
}
