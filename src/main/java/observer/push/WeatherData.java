package observer.push;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    {
        this.observerList = new ArrayList<>();
    }

    public void setMeasurementsChanged(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

}
