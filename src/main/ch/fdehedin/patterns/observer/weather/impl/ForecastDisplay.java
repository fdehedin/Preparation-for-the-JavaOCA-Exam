package ch.fdehedin.patterns.observer.weather.impl;

import java.util.logging.Logger;

import ch.fdehedin.patterns.observer.interfaces.Display;
import ch.fdehedin.patterns.observer.interfaces.Observer;
import ch.fdehedin.patterns.observer.interfaces.Subject;

public class ForecastDisplay implements Observer, Display {

	private static final Logger LOGGER = Logger.getLogger(ForecastDisplay.class.getSimpleName());

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		LOGGER.info(
				String.format("Forecast weather: %s temperature and %s humidity..", this.temperature, this.humidity));
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
