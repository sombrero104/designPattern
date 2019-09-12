package observer.push;

public class CurrentConditions implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this); // 옵저버 등록.
    }

    @Override
    public void display() {
        System.out.println("------------------------------------------");
        System.out.println("Current conditions: " + temperature + ", " + humidity + ", " + pressure);
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
