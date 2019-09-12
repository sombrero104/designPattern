package command;

public class RemoteControlTest {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        System.out.println();
        System.out.println("====================================================================");
        System.out.println("1. 매크로 커맨드를 사용하지 않는 버전.");
        System.out.println("====================================================================");

        // Light on/off/undo
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommands(0, lightOnCommand, lightOffCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        // Stereo on/off/undo
        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommands(1, stereoOnCommand, stereoOffCommand);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        // TV on/off/undo
        TV tv =  new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        remoteControl.setCommands(2, tvOnCommand, tvOffCommand);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        System.out.println("--------------------------------------------------");
        System.out.println("# RemoteControl에 있는 객체들: ");
        System.out.println();
        System.out.println(remoteControl.toString());
        System.out.println("--------------------------------------------------");

        System.out.println();
        System.out.println("====================================================================");
        System.out.println("2. 매크로 커맨드를 사용한 버전.");
        System.out.println("====================================================================");

        Command[] macroOn = { lightOnCommand, stereoOnCommand, tvOnCommand };
        Command[] macroOff = { lightOffCommand, stereoOffCommand, tvOffCommand };
        MacroCommand macroCommandOn = new MacroCommand(macroOn);
        MacroCommand macroCommandOff = new MacroCommand(macroOff);
        remoteControl.setCommands(3, macroCommandOn, macroCommandOff);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

        System.out.println("--------------------------------------------------");
        System.out.println("# RemoteControl에 있는 객체들: ");
        System.out.println();
        System.out.println(remoteControl.toString());
        System.out.println("--------------------------------------------------");
    }

}
