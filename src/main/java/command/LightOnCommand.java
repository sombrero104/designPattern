package command;

/**
 * Concrete Command
 * 커맨드.
 * 불을 켜는 명령.
 */
public class LightOnCommand implements Command {
    /**
     * 이 Light 객체는 실제 불을 켜는 방법을 알고 있는 리시버 객체이다.
     */
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}
