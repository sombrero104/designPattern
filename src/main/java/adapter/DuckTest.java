package adapter;

public class DuckTest {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();

        System.out.println("--------------------------------");
        System.out.println("The duck says..");
        mallardDuck.quack();
        mallardDuck.fly();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("--------------------------------");
        System.out.println("The turkey says..");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("--------------------------------");
        System.out.println("The turkeyAdapter says..");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        System.out.println("--------------------------------");

    }

}
