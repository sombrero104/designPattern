package factory.abstractFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.veggies = ingredientFactory.createVeggies();
    }

}
