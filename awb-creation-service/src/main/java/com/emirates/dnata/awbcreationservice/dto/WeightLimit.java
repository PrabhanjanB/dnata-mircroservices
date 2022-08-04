package com.emirates.dnata.awbcreationservice.dto;


public class WeightLimit {
	
	private double minweight;
	private double maxweight;
	
	
	public WeightLimit(double minweight, double maxweight) {
		super();
		this.minweight = minweight;
		this.maxweight = maxweight;
	}
	
	public WeightLimit() {
	}
	
	public double getMinweight() {
		return minweight;
	}
	public void setMinweight(double minweight) {
		this.minweight = minweight;
	}
	public double getMaxweight() {
		return maxweight;
	}
	public void setMaxweight(double maxweight) {
		this.maxweight = maxweight;
	}
	@Override
	public String toString() {
		return "WeightLimit [minweight=" + minweight + ", maxweight=" + maxweight + "]";
	}
	
	
}
