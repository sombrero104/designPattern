package compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Composite
 * (Composite Pattern)
 */
public class Flock implements Quackable {
    List<Quackable> quackableList = new ArrayList<>();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quackable) {
        quackableList.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackableList.iterator();
        while(iterator.hasNext()) {
            Quackable quackable = iterator.next();
            quackable.quack();
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

}
