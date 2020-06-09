package com.spring.boot.weather.info.controller;

import java.util.List;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.weather.info.model.WeatherReading;
import com.spring.boot.weather.info.service.WeatherService;

@Singleton
@RestController
@RequestMapping("/weather")
public class WeatherInfoController {
	
	private WeatherService weatherService;
	
	@Autowired
	public WeatherInfoController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
//	private ObjectMapper objectMapper;
//	//contructor DI
//	public WeatherInfoController(ObjectMapper objectMapper) {
//		this.objectMapper = objectMapper;
//	}

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
	
	@GetMapping("/sortedReadings")
	public List<WeatherReading> getAll(){
		return weatherService.getWeatherReadings();
	}


}
