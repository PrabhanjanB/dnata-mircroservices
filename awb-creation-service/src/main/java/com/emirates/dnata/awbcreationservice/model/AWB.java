package com.emirates.dnata.awbcreationservice.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.emirates.dnata.awbcreationservice.dto.AWBTariff;

@Document(collection = "awbdata")
public class AWB {

	@Id
	private String id;
	private String awbPrefix;
	private String awbNumber;
	private String awbNature;
	private String origin;
	private String destination;
	private int pieces;
	private double weight;
	private String awbStatus;
	@Field("flights")
	private ArrayList<Flight> flights;
	@Field("agent")
	private ArrayList<Agent> agent;
	private String createDate;
	private ArrayList<String> scc;
	private AWBTariff tariff;
	
	public AWB() {
		super();
	}

	public AWB(String id, String awbPrefix, String awbNumber, String awbNature, String origin, String destination,
			int pieces, double weight, String awbStatus, ArrayList<Flight> flights, ArrayList<Agent> agent,
			String createDate, ArrayList<String> scc, AWBTariff tariff) {
		super();
		this.id = id;
		this.awbPrefix = awbPrefix;
		this.awbNumber = awbNumber;
		this.awbNature = awbNature;
		this.origin = origin;
		this.destination = destination;
		this.pieces = pieces;
		this.weight = weight;
		this.awbStatus = awbStatus;
		this.flights = flights;
		this.agent = agent;
		this.createDate = createDate;
		this.scc = scc;
		this.tariff = tariff;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAwbPrefix() {
		return awbPrefix;
	}

	public void setAwbPrefix(String awbPrefix) {
		this.awbPrefix = awbPrefix;
	}

	public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	public String getAwbNature() {
		return awbNature;
	}

	public void setAwbNature(String awbNature) {
		this.awbNature = awbNature;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getAwbStatus() {
		return awbStatus;
	}

	public void setAwbStatus(String awbStatus) {
		this.awbStatus = awbStatus;
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}

	public ArrayList<Agent> getAgent() {
		return agent;
	}

	public void setAgent(ArrayList<Agent> agent) {
		this.agent = agent;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public ArrayList<String> getScc() {
		return scc;
	}

	public void setScc(ArrayList<String> scc) {
		this.scc = scc;
	}

	public AWBTariff getTariff() {
		return tariff;
	}

	public void setTariff(AWBTariff tariff) {
		this.tariff = tariff;
	}

	@Override
	public String toString() {
		return "AWB [id=" + id + ", awbPrefix=" + awbPrefix + ", awbNumber=" + awbNumber + ", awbNature=" + awbNature
				+ ", origin=" + origin + ", destination=" + destination + ", pieces=" + pieces + ", weight=" + weight
				+ ", awbStatus=" + awbStatus + ", flights=" + flights + ", agent=" + agent + ", createDate="
				+ createDate + ", scc=" + scc + ", tariff=" + tariff + "]";
	}


}
