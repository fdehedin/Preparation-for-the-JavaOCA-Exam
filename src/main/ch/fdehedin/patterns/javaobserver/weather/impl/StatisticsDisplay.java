package ch.fdehedin.patterns.javaobserver.weather.impl;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

import ch.fdehedin.patterns.observer.interfaces.Display;

public class StatisticsDisplay implements Observer, Display {

	private static final Logger LOGGER = Logger.getLogger(StatisticsDisplay.class.getSimpleName());

	private WeatherData weatherData;

	public StatisticsDisplay(Observable weatherStation) {
		// this.weatherData = weatherData;
		weatherStation.addObserver(this);
	}

	@Override
	public void display() {
		LOGGER.info(String.format("Statistics weather: %s temperature and %s humidity..",
				this.weatherData.getTemperature(), this.weatherData.getHumidity()));

	}

	@Override
	public void update(Observable weatherStation, Object weatherData) {
		this.weatherData = (WeatherData) weatherData;
		this.display();
	}

}
