package compound;

/**
 * Concrete Observer
 * (Observer Pattern)
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("\t- Duck Quackologist: " + quackObservable + " just quacked.");
    }

}
