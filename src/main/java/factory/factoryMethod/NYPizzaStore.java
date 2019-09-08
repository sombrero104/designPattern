package factory.factoryMethod;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(("cheese").equals(type)) pizza = new NYStyleCheesePizza();
        if(("peper").equals(type)) pizza = new NYStylePepperoniPizza();
        if(("clam").equals(type)) pizza = new NYStyleClamPizza();
        if(("veggie").equals(type)) pizza = new NYStyleVeggiePizza();
        return pizza;
    }

}
