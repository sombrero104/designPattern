package templateMethod;

public abstract class Beverage {

    final void prepareRecipe() {
        System.out.println("-----------------------------");

        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments()) {
            addCondiments();
        }

        System.out.println("-----------------------------");
    }

    void boilWater() {
        System.out.println("물 끓이는 중.");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("컵에 따르는 중.");
    }

    /**
     * 이 메소드는 서브클래스에서 필요에 따라 오버라이드할 수 있는 메소드이므로 후크이다.
     */
    boolean customerWantsCondiments() {
        return true;
    }

    abstract void addCondiments();

}
