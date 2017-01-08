package ch.fdehedin.patterns.observer.weather.impl;

import java.util.ArrayList;
import java.util.List;

import ch.fdehedin.patterns.observer.interfaces.Observer;
import ch.fdehedin.patterns.observer.interfaces.Subject;

public class WeatherStation implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private float temperature;
	private float humidity;
	private float pressure;

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

}
