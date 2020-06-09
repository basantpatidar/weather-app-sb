package com.spring.boot.weather.info.controller;

import javax.inject.Singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.boot.weather.info.model.WeatherReading;

@Singleton
@RestController
@RequestMapping("/weather")
public class WeatherInfoController {
	
	private ObjectMapper objectMapper;
	//contructor DI
	public WeatherInfoController(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@GetMapping("/test")
//	@RequestMapping(value="test", method=RequestMethod.GET)
	public boolean testEndPoint() {
		return true;
	}
	
	
	
	
//	@RequestMapping(value="addWeatherReading", method=RequestMethod.POST)
	@PostMapping("/addWeatherReading")
	public Boolean AddReading(@RequestBody WeatherReading weatherReading) {
//	public Boolean AddReading(@RequestBody JsonNode jsonNode) throws JsonMappingException, JsonProcessingException {
//		WeatherReading weatherReading = objectMapper.readValue(jsonNode.toString(),WeatherReading.class);
//		System.out.println(jsonNode);
//		System.out.println(jsonNode.findValue("city"));
		
		System.out.println(weatherReading);
		
		return true;
	}


}
