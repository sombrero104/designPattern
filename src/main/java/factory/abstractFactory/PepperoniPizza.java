package factory.abstractFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.pepperoni = ingredientFactory.createPepperoni();
    }

}
