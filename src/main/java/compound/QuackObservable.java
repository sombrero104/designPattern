package compound;

/**
 * Observer
 * (Observer Pattern)
 */
public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();

}
