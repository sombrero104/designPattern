package singleton;

public class SingletonError {
    private static SingletonError singletonError;

    private SingletonError() {
    }

    public static SingletonError getInstance() {
        if(singletonError == null) {
            singletonError = new SingletonError();
        }
        return singletonError;
    }

}
