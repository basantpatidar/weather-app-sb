package com.spring.boot.weather.info.config;

import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.amazonaws.services.sns.AmazonSNS;

@Configuration
public class MyWebMvcConfig {

	@Bean
	public WebMvcConfigurer webMvcConfig() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("GET","PUT","POST","DELETE","PATCH").allowedHeaders("*");
			}
		};
	}

	//Name of method doesn't matter as long as its returning restTemplete bean.
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public NotificationMessagingTemplate notificationMessagingTemplate(AmazonSNS amazonSNS) {
		return new NotificationMessagingTemplate(amazonSNS);
	}

}
