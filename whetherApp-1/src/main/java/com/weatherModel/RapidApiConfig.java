package com.weatherModel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RapidApiConfig {
	
	
	 @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

    @Value("${rapidapi.clientId}")
    private String clientId;

    @Value("${rapidapi.clientSecret}")
    private String clientSecret;

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }
}

