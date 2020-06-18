package com.spring.boot.weather.info.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WeatherAlert {

	private String alert;
	
	

	private WeatherReading weather;
	
	public WeatherAlert(String alert, WeatherReading weather) {
		super();
		this.alert = alert;
		this.weather = weather;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public WeatherReading getWeather() {
		return weather;
	}

	public void setWeather(WeatherReading weather) {
		this.weather = weather;
	}
}
