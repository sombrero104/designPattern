package chain.chain2;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    protected abstract void write(String message);

    public void logMessage(int level, String message) {
        if(this.level <= level) {
            write(message);
        } else if(nextLogger != null) {
            nextLogger.logMessage(level, message);
        } else {
            System.out.println("No logger could handle it..");
        }
    }

}