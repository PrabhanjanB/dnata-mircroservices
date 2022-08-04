package com.emirates.dnata.awbcreationservice.dto;

import com.emirates.dnata.awbcreationservice.model.AWB;

public class AWBCreationResponse {

	private String message;
	private String port;
	private AWB awb;

	public AWBCreationResponse() {
	}

	public AWBCreationResponse(String message, String port, AWB awb) {
		this.message = message;
		this.port = port;
		this.awb = awb;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public AWB getAwb() {
		return awb;
	}

	public void setAwb(AWB awb) {
		this.awb = awb;
	}

	@Override
	public String toString() {
		return "AWBCreationResponse [message=" + message + ", port=" + port + ", awb=" + awb + "]";
	}

}
