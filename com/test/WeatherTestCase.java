package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.Weather;

public class WeatherTestCase {
	Weather weather = new Weather(true, 12);

	@Test
	public void rainbowTest() {
		assertTrue("There is not a rainbow!", weather.getRaining() && (weather.getTemperature() > 10));
		
		if(!weather.getRaining()){
			fail("Test failed");
		}
	}
	
	@Test
	public void rainbowTest2() {
		assertTrue("There is not a rainbow!", weather.getRaining() && (weather.getTemperature() < 10));
	}


}
