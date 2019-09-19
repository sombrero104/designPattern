package chain.chain2;

/**
 * Client
 */
public class LoggerTest {

    public static void main(String[] args) {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        System.out.println("-------------------------------------------------------");
        errorLogger.logMessage(AbstractLogger.INFO, "This is an info level information.");
        errorLogger.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        errorLogger.logMessage(AbstractLogger.ERROR, "This is an error level information.");
        System.out.println("-------------------------------------------------------");
    }

}
