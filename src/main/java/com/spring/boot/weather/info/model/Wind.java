package com.spring.boot.weather.info.model;

import java.util.UUID;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

import lombok.Data;

//@Entity
public class Wind {
//	@Id @GeneratedValue
	private String id;

	private double speed;
	
	private double degree;
	
	public Wind() {
		
//		this.id = UUID.randomUUID().toString();
		
	}
	

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
