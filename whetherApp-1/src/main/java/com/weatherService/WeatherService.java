package com.weatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weatherModel.RapidApiConfig;

@Service
public class WeatherService {

	  private final RestTemplate restTemplate;

	    @Autowired
	    public WeatherService(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

//    @Autowired
//    private RapidApiConfig rapidApiConfig;

    public String getForecastSummaryByLocationName(String cityName) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", "3befd5dbd8mshc6d737112793534p10c569jsn6e335bdd937e");
        headers.set("X-RapidAPI-Host", "forecast9.p.rapidapi.com");
//        https://forecast9.p.rapidapi.com/rapidapi/forecast/Berlin/summary/
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(
                "https://forecast9.p.rapidapi.com/rapidapi/forecast/"+cityName+"/summary/",
                HttpMethod.GET, entity, String.class);

        return response.getBody();
    }

    public String getHourlyForecastByLocationName(String cityName) {
        HttpHeaders headers = new HttpHeaders();
//        headers.set("X-RapidAPI-Key", "3befd5dbd8mshc6d737112793534p10c569jsn6e335bdd937e");

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(
        		"https://api.openweathermap.org/data/2.5/forecast?q="+cityName+"&appid=429bcdfc2cd3d075f0f369a6379f8906",
                HttpMethod.GET, entity, String.class);

        return response.getBody();
    }
}

