package observer.push;

/**
 * Concrete Observer
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float tempterature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this); // 옵저버 등록.
    }

    @Override
    public void display() {
        System.out.println("------------------------------------------");
        System.out.println("Forecast: " + tempterature + ", " + humidity + ", " + pressure);
        System.out.println("------------------------------------------");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.tempterature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

}
