package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);
	}

	/*
	 * @Bean
	 * public WebMvcConfigurer corsConfigurer() {
	 * return new WebMvcConfigurer() {
	 * 
	 * @Override
	 * public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**").allowedOrigins("http://localhost:8100").
	 * allowedMethods("*")
	 * .allowedHeaders("*");
	 * }
	 * };
	 * }
	 */

}
