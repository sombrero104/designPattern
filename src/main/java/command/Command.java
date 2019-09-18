package command;

/**
 * Command
 * 커맨드 인터페이스.
 */
public interface Command {

    public void execute();

    public void undo();

}
