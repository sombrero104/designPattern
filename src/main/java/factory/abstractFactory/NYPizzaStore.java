package factory.abstractFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(("cheese").equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName(((NYPizzaIngredientFactory)ingredientFactory).NY_STYLE + " Cheese Pizza");
        } else if(("peper").equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName(((NYPizzaIngredientFactory)ingredientFactory).NY_STYLE + " Pepperoni Pizza");
        } else if(("clam").equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName(((NYPizzaIngredientFactory)ingredientFactory).NY_STYLE + " Clam Pizza");
        } else if(("veggie").equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(((NYPizzaIngredientFactory)ingredientFactory).NY_STYLE + " Veggie Pizza");
        }
        return pizza;
    }

}
