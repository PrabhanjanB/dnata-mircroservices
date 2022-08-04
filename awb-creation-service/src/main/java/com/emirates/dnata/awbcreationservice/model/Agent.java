package com.emirates.dnata.awbcreationservice.model;

public class Agent {

	public String name;
	public String address;
	public String type;
	
	public Agent() {
		super();
	}

	public Agent(String name, String address, String type) {
		super();
		this.name = name;
		this.address = address;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Agent [name=" + name + ", address=" + address + ", type=" + type + "]";
	}

}