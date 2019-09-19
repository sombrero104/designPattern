package chain.chain1;

/**
 * Client
 */
public class ReceiverTest {

    public static void main(String[] args) {
        Receiver oddReceiver = new OddReceiver("홀수 리시버");
        Receiver evenReceiver = new EvenReceiver("짝수 리시버");
        oddReceiver.setNextReceiver(evenReceiver);
        for(int i=0; i<20; i++) {
            oddReceiver.support(i);
        }
    }

}
