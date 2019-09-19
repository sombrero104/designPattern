package chain.chain1;

/**
 * Concrete Handler
 */
public class OddReceiver extends Receiver {

    public OddReceiver(String receiverName) {
        super(receiverName);
    }

    @Override
    public boolean resolve(int number) {
        if((number % 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void done(int number) {
        System.out.println(number + ": " + receiverName + "가 해결.");
    }

}
