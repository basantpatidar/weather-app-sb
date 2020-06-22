package com.spring.boot.weather.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.weather.info.model.Wind;
@Repository
public interface WindRepository extends JpaRepository<Wind, String>{

}
