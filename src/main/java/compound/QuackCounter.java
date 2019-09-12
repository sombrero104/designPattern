package compound;

public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

}
