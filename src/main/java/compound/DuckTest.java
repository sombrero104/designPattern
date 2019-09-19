package compound;

import strategy.Quack;

/**
 *
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
 *      => Quackable 인터페이스를 구현한 QuackCounter(데코레이터)를 만들어서
 *         위에서 구현한 Quackable 구현체들을 전달하여(감싸서) 각각의 quack()을 호출하고 카운트를 셈.
 *
 * (4) 꽥 학자들이 QuackCounter로 장식되지 않은 Quackable 객체가 있을지도 모른다는 걱정을 함.
 *     모든 객체를 팩토리에서 만들도록 바꿈. (추상 팩토리 패턴)
 *      => AbstractDuckFactory를 상속받는 CountingDuckFactory 추가. 모든 오리 객체들을 만드는 팩토리 역할.
 *
 * (5) 모든 오리와 거위, Quackable 객체들을 관리하는게 힘들어지기 시작하여 오리떼 계층구조로 관리. (컴포지트 패턴)
 *      => 오리떼인 Flock을 추가.
 *         Flock인 flockOfDucks에 RedHeadDuck, RubberDuck, Goose 추가.
 *         MallardDuck 세마리를 새로운 Flock인 flockOfMallards에 추가.
 *         Flock인 flockOfDucks에 Flock인 flockOfMallards를 추가.
 *
 * (6) 꽥 학자들은 Quackable에서 꽥 소리를 냈을 때 알림을 받고 싶어함. (옵저버 패턴)
 *      => QuackObservable
 *      Observable
 *      Observer
 *
 *
 */

/**
 * Client
 */
public class DuckTest {

    void simulate(Quackable quackable) {
        quackable.quack();
    }

    void simulate(AbstractDuckFactory duckFactory) {
        /*Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());*/
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new QuackCounter(new GooseAdapter(new Goose()));

        System.out.println("\nDuck Simulator!");
        System.out.println("----------------------------------");

        /*simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(goose);*/

        // 오리떼 Flock (컴포지트 패턴) 사용.
        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redHeadDuck); // Quack.
        flockOfDucks.add(rubberDuck); // Quack.
        flockOfDucks.add(goose); // Honk.
        flockOfDucks.add(flockOfMallards); // Quack. Quack. Quack.

        System.out.println("With Observer");
        System.out.println("----------------------------------");
        MallardsQuackologist mallardsQuackologist = new MallardsQuackologist();
        MallardsQuackologist2 mallardsQuackologist2 = new MallardsQuackologist2();
        flockOfMallards.registerObserver(mallardsQuackologist);
        flockOfMallards.registerObserver(mallardsQuackologist2);
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("1. Whole Flock.");
        System.out.println("----------------------------------");
        simulate(flockOfDucks);

        System.out.println("----------------------------------");
        System.out.println("2. Mallard Flock.");
        System.out.println("----------------------------------");
        simulate(flockOfMallards);

        System.out.println("----------------------------------");
        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times.");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        DuckTest duckTest = new DuckTest();
        // duckTest.simulate();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckTest.simulate(duckFactory);
    }

}
