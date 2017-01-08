package ch.fdehedin.patterns.javaobserver.weather.impl;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

import ch.fdehedin.patterns.observer.interfaces.Display;

public class CurrentConditionsDisplay implements Observer, Display {

	private static final Logger LOGGER = Logger.getLogger(CurrentConditionsDisplay.class.getSimpleName());

	private WeatherData weatherData;

	public CurrentConditionsDisplay(Observable weatherStation) {
		weatherStation.addObserver(this);
	}

	@Override
	public void display() {
		LOGGER.info(String.format("Current weather: %s temperature and %s humidity..",
				this.weatherData.getTemperature(), this.weatherData.getHumidity()));

	}

	@Override
	public void update(Observable weatherStation, Object weatherData) {
		System.out.println("inside update..");
		this.weatherData = (WeatherData) weatherData;
		this.display();
	}

}
