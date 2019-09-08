package factory.abstractFactory;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        System.out.println("---------------------------------------------");
        Pizza nyStylePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("# Pizza name: " + nyStylePizza.getName());
        System.out.println("---------------------------------------------");
    }

}
