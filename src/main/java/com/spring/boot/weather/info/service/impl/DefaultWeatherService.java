package com.spring.boot.weather.info.service.impl;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.weather.info.model.WeatherReading;
import com.spring.boot.weather.info.service.WeatherService;

@Service
public class DefaultWeatherService implements WeatherService{
	
	List<WeatherReading> list = new LinkedList<>();

	@Override
	public boolean addWeatherReadings(WeatherReading weatherReading) {
		System.out.println(weatherReading);
		list.add(weatherReading);
		return true;
	}

	@Override
	public List<WeatherReading> getWeatherReadings() {
		list.sort(Comparator.comparing(WeatherReading::getTimestamp));
		return list;
	}

	
}
