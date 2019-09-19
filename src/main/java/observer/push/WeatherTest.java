package observer.push;

/**
 * Client
 */
public class WeatherTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurementsChanged(86, 62, 36.7f);
        weatherData.setMeasurementsChanged(51, 37, 9.15f);
    }

}
