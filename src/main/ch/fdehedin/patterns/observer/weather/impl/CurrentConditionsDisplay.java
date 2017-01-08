package ch.fdehedin.patterns.observer.weather.impl;

import java.util.logging.Logger;

import ch.fdehedin.patterns.observer.interfaces.Display;
import ch.fdehedin.patterns.observer.interfaces.Observer;
import ch.fdehedin.patterns.observer.interfaces.Subject;
import ch.fdehedin.patterns.strategie.duck.DuckMallard;

public class CurrentConditionsDisplay implements Observer, Display {

	private static final Logger LOGGER = Logger.getLogger(CurrentConditionsDisplay.class.getSimpleName());

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		LOGGER.info(
				String.format("Current weather: %s temperature and %s humidity..", this.temperature, this.humidity));

	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
