package com.spring.boot.weather.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.weather.info.model.WeatherReading;
import com.spring.boot.weather.info.service.WeatherService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;




@RestController
@RequestMapping("/weather")
public class WeatherInfoController {
	
	private WeatherService weatherService;
	
	@Autowired
	public WeatherInfoController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
//	private ObjectMapper objectMapper;
//	//constructor DI
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
	@ApiOperation(value="A Post method for Adding List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "ok"),
			@ApiResponse(code = 201, message = "Added"),
			@ApiResponse(code = 500, message = "Internal Server Error")
	})
	public boolean AddReading(@RequestBody WeatherReading weatherReading) {
//	public Boolean AddReading(@RequestBody JsonNode jsonNode) throws JsonMappingException, JsonProcessingException {
//		WeatherReading weatherReading = objectMapper.readValue(jsonNode.toString(),WeatherReading.class);
//		System.out.println(jsonNode);
//		System.out.println(jsonNode.findValue("city"));
		
//		System.out.println(weatherReading);
		weatherService.addWeatherReadings(weatherReading);
		
		return true;
	}
	
	@GetMapping("/sortedReadings")
	public List<WeatherReading> getAll(){
		return weatherService.getWeatherReadingsSorted();
	}


}
