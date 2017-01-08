package ch.fdehedin.patterns.javaobserver.weatherstation.copy;

import java.util.Observable;

import org.junit.Test;

import ch.fdehedin.patterns.javaobserver.weather.impl.CurrentConditionsDisplay;
import ch.fdehedin.patterns.javaobserver.weather.impl.ForecastDisplay;
import ch.fdehedin.patterns.javaobserver.weather.impl.StatisticsDisplay;
import ch.fdehedin.patterns.javaobserver.weather.impl.WeatherStation;

public class WeatherStationJAvaTest {

	@Test
	public void testWeatherStation() {
		WeatherStation weatherStation = new WeatherStation();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);
		StatisticsDisplay statisticDisplay = new StatisticsDisplay(weatherStation);

		weatherStation.setMeasurements(20, 10, 30);
		weatherStation.setMeasurements(10, 50, 30);
		weatherStation.setMeasurements(50, 10, 30);
	}

}
