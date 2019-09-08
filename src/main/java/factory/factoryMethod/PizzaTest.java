package factory.factoryMethod;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        System.out.println("---------------------------------------------");
        Pizza nyStylePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("# Pizza name: " + nyStylePizza.getName());
        System.out.println("---------------------------------------------");
        Pizza chicagoStylePizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("# Pizza name: " + chicagoStylePizza.getName());
        System.out.println("---------------------------------------------");
    }

}
