package com.weatherController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weatherService.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/forecast-summary")
    public ResponseEntity<String> getForecastSummary(@RequestParam String cityName) {
        String forecastSummary = weatherService.getForecastSummaryByLocationName(cityName);
        return ResponseEntity.ok(forecastSummary);
    }

    @GetMapping("/hourly-forecast")
    public ResponseEntity<String> getHourlyForecast(@RequestParam String cityName) {
        String hourlyForecast = weatherService.getHourlyForecastByLocationName(cityName);
        return ResponseEntity.ok(hourlyForecast);
    }
}
