package com.spring.boot.weather.info.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.boot.weather.info.awsMessanging.WeatherAlertSns;
import com.spring.boot.weather.info.model.WeatherAlert;
import com.spring.boot.weather.info.model.WeatherReading;
import com.spring.boot.weather.info.service.WeatherService;

@Service
public class DefaultWeatherService implements WeatherService{
	
//	List<WeatherReading> list = new LinkedList<>();
	
	private RestTemplate restTemplate;
	private WeatherAlertSns weatherAlertSns;
	private ObjectMapper objectMapper;
	
	@Autowired
	public DefaultWeatherService(RestTemplate restTemplate, WeatherAlertSns weatherAlertSns, ObjectMapper objectMapper) {
		this.restTemplate = restTemplate;
		this.weatherAlertSns = weatherAlertSns;
		this.objectMapper = objectMapper;
	}

	@Override
	public boolean addWeatherReadings(WeatherReading weatherReading) throws JsonProcessingException {
		System.out.println(weatherReading);
//		list.add(weatherReading);
		if(weatherReading.getTemperature() > 25) {
			WeatherAlert weatherAlert = new WeatherAlert("Too Hot", weatherReading);
			String message = objectMapper.writeValueAsString(weatherAlert);
			weatherAlertSns.send("Tempareture", message);
//			return restTemplate.postForObject("http://localhost:9090/addReading", weatherAlert, boolean.class);
		}
		
		if(weatherReading.getWind().getSpeed() > 6) {
			WeatherAlert weatherAlert = new WeatherAlert("Too windy", weatherReading);
			String message = objectMapper.writeValueAsString(weatherAlert);
			weatherAlertSns.send("Tempareture", message);
//			return restTemplate.postForObject("http://localhost:9090/addReading", weatherAlert, boolean.class);
		}
		return false;
	}

	@Override
	public List<WeatherReading> getWeatherReadingsSorted() {
//		list.sort(Comparator.comparing(WeatherReading::getTimestamp));
		return null;
	}

	
}
