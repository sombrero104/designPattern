package command;

/**
 * Concrete Command
 * 커맨드.
 * 아무 동작도 하지 않는 커맨드.
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

}
