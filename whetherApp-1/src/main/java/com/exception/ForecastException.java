package com.exception;

import org.springframework.web.client.HttpClientErrorException;

public class ForecastException extends Exception {
	
	
	public ForecastException (){
		super();
	}
	
	public ForecastException (String s){
		super(s);
		
	}

	
	

}
