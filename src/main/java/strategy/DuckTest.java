package strategy;

public class DuckTest {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();
    }

}
