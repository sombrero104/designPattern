package templateMethod;

public class TeaMaker {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        BlackTea blackTea = new BlackTea();
        blackTea.prepareRecipe();
    }

}
