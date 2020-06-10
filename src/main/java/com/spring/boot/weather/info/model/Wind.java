package com.spring.boot.weather.info.model;

import java.util.UUID;

public class Wind {
	
	String id;

	double speed;
	
	double degree;
	
	

	public Wind(String id, double speed, double degree) {
		super();
		this.id = UUID.randomUUID().toString();
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
