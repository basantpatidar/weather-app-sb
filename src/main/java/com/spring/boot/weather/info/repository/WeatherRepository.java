package com.spring.boot.weather.info.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.weather.info.model.WeatherReading;

@Repository
public interface WeatherRepository extends CrudRepository<WeatherReading, String>{

}
