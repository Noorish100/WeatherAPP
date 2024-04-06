package Service;



public interface WeatherService {

	String getForecastSummary(String cityName);

	String getHourlyForecast(String cityName);
	
	

}
