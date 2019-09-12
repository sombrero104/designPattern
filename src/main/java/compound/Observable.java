package compound;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {
    List<Observer> observerList = new ArrayList<>();
    QuackObservable quackObservable;

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

}
