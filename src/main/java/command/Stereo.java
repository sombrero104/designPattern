package command;

/**
 * Receiver
 * 리시버.
 * 실제 스테레오를 켜는 방법을 알고 있는 리시버.
 */
public class Stereo {

    public void on() {
        System.out.println("-------------------------");
        System.out.println("스테레오를 켭니다.");
        System.out.println("-------------------------");
    }

    public void setCD() {
        System.out.println("-------------------------");
        System.out.println("스테레오에 CD를 넣습니다.");
        System.out.println("-------------------------");
    }

    public void setVolume(int volume) {
        System.out.println("-------------------------");
        System.out.println("스테레오 볼륨을 " + volume + "(으)로 설정합니다.");
        System.out.println("-------------------------");
    }

    public void off() {
        System.out.println("-------------------------");
        System.out.println("스테레오를 끕니다.");
        System.out.println("-------------------------");
    }

}
