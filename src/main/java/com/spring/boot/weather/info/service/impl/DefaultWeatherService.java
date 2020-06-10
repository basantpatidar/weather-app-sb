package com.spring.boot.weather.info.service.impl;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.weather.info.model.WeatherReading;
import com.spring.boot.weather.info.repository.WeatherRepository;
import com.spring.boot.weather.info.service.WeatherService;

@Service
public class DefaultWeatherService implements WeatherService{
	
//	List<WeatherReading> list = new LinkedList<>();
	
	WeatherRepository weatherRespository;
	
	public DefaultWeatherService(WeatherRepository weatherRepository) {
		this.weatherRespository = weatherRepository;
	}

	@Override
	public boolean addWeatherReadings(WeatherReading weatherReading) {
		System.out.println(weatherReading);
//		list.add(weatherReading);
		weatherRespository.save(weatherReading);
		return true;
	}

	@Override
	public List<WeatherReading> getWeatherReadingsSorted() {
//		list.sort(Comparator.comparing(WeatherReading::getTimestamp));
		List<WeatherReading> weatherList = (List<WeatherReading>) weatherRespository.findAll();
		return weatherList;
	}

	
}
