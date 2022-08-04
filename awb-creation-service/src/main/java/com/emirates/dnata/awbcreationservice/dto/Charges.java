package com.emirates.dnata.awbcreationservice.dto;

public class Charges {

	private double txf;
	private double handling;
	private double airline;

	public Charges(double txf, double handling, double airline) {
		this.txf = txf;
		this.handling = handling;
		this.airline = airline;
	}

	public Charges() {
	}

	public double getTxf() {
		return txf;
	}

	public void setTxf(double txf) {
		this.txf = txf;
	}

	public double getHandling() {
		return handling;
	}

	public void setHandling(double handling) {
		this.handling = handling;
	}

	public double getAirline() {
		return airline;
	}

	public void setAirline(double airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Charges [txf=" + txf + ", handling=" + handling + ", airline=" + airline + "]";
	}

	
}