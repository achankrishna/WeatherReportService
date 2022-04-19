package com.ntuc.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@Configuration
public class WeatherMapServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherMapServiceApplication.class, args);
	}

}
