<body>
    <h1>Project Name: Weather Forecast API Integration</h1>
    <h2>Description:</h2>
    <p>
        This project integrates with the Weather API from Rapid API to provide weather forecast information for any city. It exposes two RESTful APIs using SpringBoot Java, allowing users to retrieve the weather forecast summary and hourly forecast details for a specific city.
    </p>
    <h2>Authentication Method:</h2>
    <p>
        Header-based authentication is used with random client ID and client secret. The client ID and secret are obtained from Rapid API and included in the request headers for authentication.
    </p>
       <p>Basic Authentication ------>username = user password = 12345</p>
     <h2>Swagger URL Frontend----->http://localhost:8882/swagger-ui/index.html<h2>
    <h2>API Endpoints:</h2>
    <h3>Get Weather Forecast Summary by Location Name</h3>
    <ul>
        <li><strong>Endpoint:</strong> /weather/forecast-summary</li>
        <li><strong>Method:</strong> GET</li>
        <li><strong>Parameters:</strong> cityName: Name of the city for which the weather forecast summary is requested</li>
        <li><strong>Example Request:</strong> /weather/forecast-summary?cityName=London</li>
        <li><strong>Example Response:</strong></li>
        <code>
            {
            "city": "London",
            "summary": "Cloudy with occasional showers. High 12°C. Winds WSW at 15 to 30 km/h. Chance of rain 50%."
            }
        </code>
    </ul>
    <h3>Get Hourly Weather Forecast by Location Name</h3>
    <ul>
        <li><strong>Endpoint:</strong> /weather/hourly-forecast</li>
        <li><strong>Method:</strong> GET</li>
        <li><strong>Parameters:</strong> cityName: Name of the city for which the hourly weather forecast is requested</li>
        <li><strong>Example Request:</strong> /weather/hourly-forecast?cityName=New York</li>
        <li><strong>Example Response:</strong></li>
        <code>
            {
            "city": "New York",
            "hourlyForecast": [
                {
                "time": "12:00 PM",
                "temperature": 15,
                "condition": "Partly Cloudy",
                "windSpeed": 10
                },
                {
                "time": "01:00 PM",
                "temperature": 16,
                "condition": "Partly Cloudy",
                "windSpeed": 12
                },
                {
                "time": "02:00 PM",
                "temperature": 17,
                "condition": "Sunny",
                "windSpeed": 14
                },
                ...
            ]
            }
        </code>
    </ul>
    <h2>Setup:</h2>
    <ol>
        <li>Clone the repository: <code>git clone &lt;repository-url&gt;</code></li>
        <li>Install dependencies: <code>mvn clean install</code></li>
        <li>Run the application: <code>mvn spring-boot:run</code></li>
        <li>Access the API endpoints using the provided URLs.</li>
    </ol>

</body>
