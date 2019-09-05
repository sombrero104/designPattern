package templateMethod;

public class BlackTea extends Beverage {
    private String userInput = "n";

    void brew() {
        System.out.println("차를 우려내는 중.");
    }

    void addCondiments() {
        System.out.println("레몬을 추가하는 중.");
    }

    @Override
    boolean customerWantsCondiments() {
        if(getUserInput().toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

}
