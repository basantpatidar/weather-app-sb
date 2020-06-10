package com.spring.boot.weather.info.model;

public class Wind {

	double speed;
	
	double degree;
	
	

	public Wind(double speed, double degree) {
		super();
		this.speed = speed;
		this.degree = degree;
	}
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDegree() {
		return degree;
	}
	public void setDegree(double degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", degree=" + degree + "]";
	}
}
