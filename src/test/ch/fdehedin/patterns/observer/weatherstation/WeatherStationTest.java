package ch.fdehedin.patterns.observer.weatherstation;

import org.junit.Test;

import ch.fdehedin.patterns.observer.weather.impl.CurrentConditionsDisplay;
import ch.fdehedin.patterns.observer.weather.impl.ForecastDisplay;
import ch.fdehedin.patterns.observer.weather.impl.StatisticsDisplay;
import ch.fdehedin.patterns.observer.weather.impl.WeatherStation;

public class WeatherStationTest {

	@Test
	public void testWeatherStation() {
		WeatherStation weatherData = new WeatherStation();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticDisplay = new StatisticsDisplay(weatherData);

		weatherData.setMeasurements(20, 10, 30);
		weatherData.setMeasurements(10, 50, 30);
		weatherData.setMeasurements(50, 10, 30);
	}

}
