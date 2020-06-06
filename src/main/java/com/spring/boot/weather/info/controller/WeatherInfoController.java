package com.spring.boot.weather.info.controller;

import javax.inject.Singleton;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Singleton
@RestController
public class WeatherInfoController {
	
	@RequestMapping(value="addWeatherReading", method=RequestMethod.POST)
	public Boolean AddReading() {
		System.out.println("In");
		return true;
	}


}
