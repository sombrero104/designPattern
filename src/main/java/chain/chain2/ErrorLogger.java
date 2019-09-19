package chain.chain2;

/**
 * Concrete Handler
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Logger: " + message);
    }

}
