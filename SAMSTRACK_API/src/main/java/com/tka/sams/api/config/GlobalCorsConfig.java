package com.tka.sams.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalCorsConfig {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**") // Allow all endpoints
						.allowedOrigins("*") // Allow all origins
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH") // Allow all HTTP methods
						.allowedHeaders("*") // Allow all headers
						.allowCredentials(false); // Set true if you need cookies/auth headers
			}
		};
	}
}
