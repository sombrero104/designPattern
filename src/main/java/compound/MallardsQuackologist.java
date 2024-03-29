package compound;

/**
 * Concrete Observer
 * (Observer Pattern)
 */
public class MallardsQuackologist implements Observer {

    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("\t- Mallard Quackologist: " + quackObservable + " just quacked.");
    }

}
