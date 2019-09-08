package factory.factoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(("cheese").equals(type)) pizza = new ChicagoStyleCheesePizza();
        if(("peper").equals(type)) pizza = new ChicagoStylePepperoniPizza();
        if(("clam").equals(type)) pizza = new ChicagoStyleClamPizza();
        if(("veggie").equals(type)) pizza = new ChicagoStyleVeggiePizza();
        return pizza;
    }

}
