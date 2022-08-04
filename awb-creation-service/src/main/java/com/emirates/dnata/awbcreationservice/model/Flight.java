package com.emirates.dnata.awbcreationservice.model;

import java.util.ArrayList;

public class Flight {

	public String airlineCode;
	public String flightNumber;
	public String flightdate;
	public ArrayList<String> route;

	public Flight() {
		super();
	}

	public Flight(String airlineCode, String flightNumber, String flightdate, ArrayList<String> route) {
		super();
		this.airlineCode = airlineCode;
		this.flightNumber = flightNumber;
		this.flightdate = flightdate;
		this.route = route;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightdate() {
		return flightdate;
	}

	public void setFlightdate(String flightdate) {
		this.flightdate = flightdate;
	}

	public ArrayList<String> getRoute() {
		return route;
	}

	public void setRoute(ArrayList<String> route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return "Flight [airlineCode=" + airlineCode + ", flightNumber=" + flightNumber + ", flightdate=" + flightdate
				+ ", route=" + route + "]";
	}

}
