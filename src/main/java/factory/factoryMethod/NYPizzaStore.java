package factory.factoryMethod;

/**
 * 팩토리 메소드 패턴
 * 클래스의 인스턴스를 만드는 일을 서브 클래스에게 맡기는 것.
 *  => PizzaStore의 서브 클래스인
 *     NYPizzaStore가 type에 따라 Pizza를 만들어서 리턴하는 팩토리라고 할 수 있다.
 */
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
