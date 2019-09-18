package command;

/**
 * Receiver
 * 리시버.
 * 실제 불을 켜는 방법을 알고 있는 리시버.
 */
public class Light {

    public void on() {
        System.out.println("-------------------------");
        System.out.println("불을 켭니다.");
        System.out.println("-------------------------");
    }

    public void off() {
        System.out.println("-------------------------");
        System.out.println("불을 끕니다.");
        System.out.println("-------------------------");
    }

}
