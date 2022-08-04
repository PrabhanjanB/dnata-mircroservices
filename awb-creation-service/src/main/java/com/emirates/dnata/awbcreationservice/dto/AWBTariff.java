package com.emirates.dnata.awbcreationservice.dto;

public class AWBTariff {
	
	private String id;
	private WeightLimit weightLimit;
	private Charges charges;
	private double totalCost;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public WeightLimit getWeightLimit() {
		return weightLimit;
	}
	public void setWeightLimit(WeightLimit weightLimit) {
		this.weightLimit = weightLimit;
	}
	public Charges getCharges() {
		return charges;
	}
	public void setCharges(Charges charges) {
		this.charges = charges;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	@Override
	public String toString() {
		return "AWBTariff [id=" + id + ", weightLimit=" + weightLimit + ", charges=" + charges + ", totalCost="
				+ totalCost + "]";
	}

    
	}
