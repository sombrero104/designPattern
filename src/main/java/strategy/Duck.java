package strategy;

public abstract class Duck {
    /**
     * 각각 오리들에게는 FlyBehavior와 QuackBehavior가 있으며
     * 각각 행동과 소리를 위임받는다.
     * 이런식으로 두 클래스를 합치는 것을 구성(composition)을 이용하는 것이라고 한다.
     * 오리 클래스는 행동을 상속 받지 않고, 올바른 행동 객체로 구성됨으로써 행동을 부여받게 된다.
     * (특정 행동을 상속받을 경우 특정 오리에겐 그 행동이 맞지 않을 수 있으므로..)
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("물에 떠있습니다.");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
