package command;

/**
 * 클라이언트.
 * SimpleRemoteControl 인보커를 실행시키는 클라이언트.
 */
public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }

}
