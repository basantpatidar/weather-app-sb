package com.spring.boot.weather.info.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.boot.weather.info.model.WeatherAlert;
import com.spring.boot.weather.info.model.WeatherReading;
import com.spring.boot.weather.info.repository.WeatherRepository;
import com.spring.boot.weather.info.service.WeatherService;

@Service
public class DefaultWeatherService implements WeatherService{
	
//	List<WeatherReading> list = new LinkedList<>();
	
	WeatherRepository weatherRespository;
	
	private RestTemplate restTemplate;
	
	@Autowired
	public DefaultWeatherService(WeatherRepository weatherRepository, RestTemplate restTemplate) {
		this.weatherRespository = weatherRepository;
		this.restTemplate = restTemplate;
	}

	@Override
	public boolean addWeatherReadings(WeatherReading weatherReading) {
		System.out.println(weatherReading);
//		list.add(weatherReading);
//		weatherRespository.save(weatherReading);
		if(weatherReading.getTemperature() > 25) {
			WeatherAlert weatherAlert = new WeatherAlert("Too Hot", weatherReading);
			return restTemplate.postForObject("http://localhost:9090/addReading", weatherAlert, boolean.class);
		}
		
		if(weatherReading.getWind().getSpeed() > 6) {
			WeatherAlert weatherAlert = new WeatherAlert("Too windy", weatherReading);
			return restTemplate.postForObject("http://localhost:9090/addReading", weatherAlert, boolean.class);
		}
		return false;
	}

	@Override
	public List<WeatherReading> getWeatherReadingsSorted() {
//		list.sort(Comparator.comparing(WeatherReading::getTimestamp));
		List<WeatherReading> weatherList = (List<WeatherReading>) weatherRespository.findAll();
		return weatherList;
	}

	
}
