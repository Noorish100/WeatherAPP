package Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Model.Wheather;
import Service.WeatherService;


@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/forecast-summary")
    public ResponseEntity<String> getForecastSummary(@RequestParam String cityName) {
        String forecastSummary = weatherService.getForecastSummary(cityName);
        return ResponseEntity.ok(forecastSummary);
    }
    
    
    @GetMapping("/hourly-forecast")
    public ResponseEntity<String> getHourlyForecast(@RequestParam String cityName) {
        String hourlyForecast = weatherService.getHourlyForecast(cityName);
        return ResponseEntity.ok(hourlyForecast);
    }
    
}



