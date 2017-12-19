package com.java;

public class Weather {
	private boolean raining;
	private int temperature;
	
	public Weather(boolean raining, int temperature) {
		this.raining = raining;
		this.temperature = temperature;
	}
	public boolean getRaining() {
		return raining;
	}
	public void setRaining(boolean raining) {
		this.raining = raining;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}
