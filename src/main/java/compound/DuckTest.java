package compound;

/**
 * 컴파운드 패턴 (Compound Pattern)
 *
 * - 오리에 적용될 패턴.
 *
 * (1) 처음에 수많은 Quackable들이 존재.
 *      => Quackable 인터페이스를 구현한 MallardDuck, RedHeadDuck, RubberDuck이 있음.
 *
 * (2) 갑자기 거위가 나타나서는 자기도 Quackable이 되고 싶다고 함. (어댑터 패턴)
 *      => Quackable 인터페이스를 구현한 GooseAdapter로 Goose의 어댑터 역할을 함.
 *
 * (3) 꽥 학자들이 등장해서 꽥 소리 횟수를 세고 싶다고 함. (데코레이터 패턴)
 *      => Quackable 인터페이스를 구현한 QuackCounter를 만들어서 위에서 구현한 Quackable 구현체들을 전달하여 각각의 quack()을 호출하고 카운트를 셈.
 *
 * (4) 꽥 학자들이 QuackCounter로 장식되지 않은 Quackable 객체가 있을지도 모른다는 걱정을 함. (추상 팩토리 패턴)
 *
 * (5) 모든 오리와 거위, Quackable 객체들을 관리하는게 힘들어지기 시작하여 오리떼 계층구조로 관리. (컴포지트 패턴)
 *
 * (6) 꽥 학자들은 Quackable에서 꽥 소리를 냈을 때 알림을 받고 싶어함. (옵저버 패턴)
 *
 */
public class DuckTest {

    void simulate(Quackable quackable) {
        quackable.quack();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new QuackCounter(new GooseAdapter(new Goose()));

        System.out.println("\nDuck Simulator!");
        System.out.println("----------------------------------");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("----------------------------------");
        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times.");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        DuckTest duckTest = new DuckTest();
        duckTest.simulate();
    }

}
