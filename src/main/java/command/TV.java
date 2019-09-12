package command;

/**
 * 리시버.
 * 실제 TV를 켜는 방법을 알고 있는 리시버.
 */
public class TV {

    public void on() {
        System.out.println("-------------------------");
        System.out.println("TV를 켭니다.");
        System.out.println("-------------------------");
    }

    public void off() {
        System.out.println("-------------------------");
        System.out.println("TV를 끕니다.");
        System.out.println("-------------------------");
    }

}
