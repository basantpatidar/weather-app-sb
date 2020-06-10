package com.spring.boot.weather.info.service;

import java.util.List;

import com.spring.boot.weather.info.model.WeatherReading;

public interface WeatherService {

	boolean addWeatherReadings(WeatherReading weatherReading);
	List<WeatherReading> getWeatherReadingsSorted();
	
}
