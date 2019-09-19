package compound;

/**
 * Concrete Observer
 * (Observer Pattern)
 */
public class MallardsQuackologist2 implements Observer {

    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("\t- Mallard Quackologist 2: " + quackObservable + " just quacked.");
    }

}
