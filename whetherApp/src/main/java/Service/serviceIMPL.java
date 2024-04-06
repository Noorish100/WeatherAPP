package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class serviceIMPL implements WeatherService {
	
	
	 private final RestTemplate restTemplate;

	    @Autowired
	    public serviceIMPL(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }
	
	

	@Override
	public String getForecastSummary(String cityName) {
		
		 String url = "https://forecast9.p.rapidapi.com/"; // Modify the URL as per your API documentation
	        String apiKey = "3befd5dbd8mshc6d737112793534p10c569jsn6e335bdd937e"; // Your API key

	        // Prepare the URL with query parameters
	        String fullUrl = url + "?city=" + cityName;

	        // Set the headers
	        HttpHeaders headers = new HttpHeaders();
	        headers.add("X-RapidAPI-Key", apiKey);
	        headers.add("X-RapidAPI-Host", "forecast9.p.rapidapi.com");

	        // Create the HTTP request entity with headers
	        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

	        // Send the HTTP GET request and get the response
	        ResponseEntity<String> responseEntity = restTemplate.exchange(fullUrl, HttpMethod.GET, requestEntity, String.class);

	        // Extract and return the response body
	        return responseEntity.getBody();
	    }
		
		
		// TODO Auto-generated method stub
		
	

	@Override
	public String getHourlyForecast(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	String key="464f045b42c423ba9e429cdc711c2050";


}
