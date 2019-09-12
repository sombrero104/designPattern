package command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    /**
     * 초기화.
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand(); // 아무 동작이 없는 커맨드 객체. 일종의 Null 객체.
        for(int i=0; i<7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * ON 버튼를 눌렀을 때
     * onCommand를 실행시키고, undoCommand에 저장해둠.
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    /**
     * OFF 버튼을 눌렀을 때
     * offCommand를 실행시키고, undoCommand에 저장해둠.
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    /**
     * UNDO 버튼을 눌렀을 때
     * undoCommand에 저장되어 있는 객체의 undo()를 실행.
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
        undoCommand = new NoCommand();
    }

    /**
     * onCommands와 offCommands 출력.
     * java.lang.Object의 toString()메소드 오버라이드.
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<7; i++) {
            sb.append(onCommands[i].getClass().getName() + " / " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }

}
