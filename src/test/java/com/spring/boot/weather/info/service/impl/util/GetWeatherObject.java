package com.spring.boot.weather.info.service.impl.util;

import com.spring.boot.weather.info.model.WeatherReading;
import com.spring.boot.weather.info.model.Wind;

public class GetWeatherObject {
	public static WeatherReading getWeatherObject() {
		return new WeatherReading("Chicago","sunny",90.1,1000,22,new Wind(), null);
	}
	public static WeatherReading getWeatherObjectTemp() {
		return new WeatherReading("Chicago","sunny",90.1,1000,26,new Wind(), null);
	}
	public static WeatherReading getWeatherObjectWind() {
		return new WeatherReading("Chicago","sunny",90.1,1000,26,new Wind(7.8,222), null);
	}

}
