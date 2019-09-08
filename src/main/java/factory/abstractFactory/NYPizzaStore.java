package factory.abstractFactory;

/**
 * 추상 팩토리 패턴
 * 인터페이스를 이용하여 서로 연관된, 또는 의존하는 객체를 구상 클래스를 지정하지 않고 생성하는 것.
 *  => 팩토리 메소드 패턴인 factoryMethod 패키지에서
 *     재료 팩토리를 분리하여 추가한 버전.
 *     PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
 *     지역(뉴욕 혹은 시카고)에 해당하는 재료 팩토리를 만들고
 *     공통 재료 팩토리 인터페이스를 사용하여
 *     피자 종류(뉴욕과 시카고의 피자 종류가 같음.)에 따라 지역에 해당하는 팩토리를 주입 받아서 재료를 사용한다.
 *     결과적으로.. 뉴욕과 시카고의 치즈 피자, 페퍼 피자, 클램 피자, 베지 피자는 다른 재료를 사용하게 된다.
 */
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
