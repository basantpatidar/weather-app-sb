package com.spring.boot.weather.info.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spring.boot.weather.info.model.WeatherReading;

public interface WeatherService {

	boolean addWeatherReadings(WeatherReading weatherReading) throws JsonProcessingException;
	List<WeatherReading> getWeatherReadingsSorted();
	
}
