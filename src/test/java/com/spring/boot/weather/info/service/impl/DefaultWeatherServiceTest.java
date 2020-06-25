package com.spring.boot.weather.info.service.impl;

import static org.junit.Assert.*;

import org.assertj.core.internal.bytebuddy.matcher.ElementMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.boot.weather.info.awsMessanging.WeatherAlertSns;
import com.spring.boot.weather.info.model.WeatherAlert;
import com.spring.boot.weather.info.service.impl.DefaultWeatherService;
import com.spring.boot.weather.info.service.impl.util.GetWeatherObject;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class DefaultWeatherServiceTest {

	private DefaultWeatherService defaultWeatherService;
	
	@Mock
	private RestTemplate restTemplate;
	
	@Mock
	private WeatherAlertSns weatherAlertSns;
	
	@Mock
	private ObjectMapper objectMapper;
	
	@Before
	public void setup() {
		defaultWeatherService = new DefaultWeatherService(restTemplate, weatherAlertSns, objectMapper);
	}
	
	@Test
	public void addWeatherReadings() throws JsonProcessingException {
		boolean b = defaultWeatherService.addWeatherReadings(GetWeatherObject.getWeatherObject());
		Assert.assertEquals(b, false);
	}
	
	@Test
	public void addWeatherTemperature() throws JsonProcessingException {
		boolean b = defaultWeatherService.addWeatherReadings(GetWeatherObject.getWeatherObjectTemp());
		Mockito.when(objectMapper.writeValueAsString(Matchers.any(WeatherAlert.class))).thenReturn("Hello World");
		Assert.assertTrue(b);
		
	}
	
	@Test
	public void addWeatherWind() throws JsonProcessingException {
		boolean b = defaultWeatherService.addWeatherReadings(GetWeatherObject.getWeatherObjectWind());
		Mockito.when(objectMapper.writeValueAsString(Matchers.any(WeatherAlert.class))).thenReturn("Hello World");
		Assert.assertTrue(b);
		
	}
	
	

}
