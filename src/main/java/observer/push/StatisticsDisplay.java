package observer.push;

/**
 * Concrete Observer
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this); // 옵저버 등록.
    }

    @Override
    public void display() {
        System.out.println("------------------------------------------");
        System.out.println("Statistics: " + temperature + ", " + humidity + ", " + pressure);
        System.out.println("------------------------------------------");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

}
