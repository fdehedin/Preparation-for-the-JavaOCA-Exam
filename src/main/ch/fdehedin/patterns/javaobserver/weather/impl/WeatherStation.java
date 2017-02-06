package ch.fdehedin.patterns.javaobserver.weather.impl;

import java.util.Observable;
import java.util.Observer;

public class WeatherStation extends Observable {

	// private List<Observer> observers = new ArrayList<>();

	private WeatherData weatherData = new WeatherData();

	public void addObserver(Observer observer) {
		System.out.println("adding observer: "+observer);
		
		super.addObserver(observer);
	
	}

	public void deleteObserver(Observer observer) {
		super.deleteObserver(observer);
	}

	public void measurementsChanged() {
		System.out.println("inside measurement changed");
		this.setChanged();
		this.notifyObservers(this.weatherData);
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.weatherData.setHumidity(humidity);
		this.weatherData.setPressure(pressure);
		this.weatherData.setTemperature(temperature);
		this.measurementsChanged();
	}

}
