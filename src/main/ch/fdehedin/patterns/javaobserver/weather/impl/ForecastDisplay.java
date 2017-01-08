package ch.fdehedin.patterns.javaobserver.weather.impl;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

import ch.fdehedin.patterns.observer.interfaces.Display;

public class ForecastDisplay implements Observer, Display {

	private static final Logger LOGGER = Logger.getLogger(ForecastDisplay.class.getSimpleName());

	private WeatherData weatherData;

	public ForecastDisplay(Observable weatherStation) {
		// this.weatherData = weatherData;
		weatherStation.addObserver(this);
	}

	@Override
	public void display() {
		LOGGER.info(String.format("Forecast weather: %s temperature and %s humidity..",
				this.weatherData.getTemperature(), this.weatherData.getHumidity()));

	}

	@Override
	public void update(Observable weatherStation, Object weatherData) {
		this.weatherData = (WeatherData) weatherData;
		this.display();
	}

}
