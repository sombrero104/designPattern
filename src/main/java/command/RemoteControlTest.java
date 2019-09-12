package command;

public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommands(0, lightOnCommand, lightOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.toString();
    }
}
