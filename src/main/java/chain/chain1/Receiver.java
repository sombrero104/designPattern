package chain.chain1;

public abstract class Receiver {
    protected String receiverName;
    private Receiver nextReceiver;

    public Receiver(String receiverName) {
        this.receiverName = receiverName;
    }

    public Receiver setNextReceiver(Receiver nextReceiver) {
        this.nextReceiver = nextReceiver;
        return nextReceiver;
    }

    public abstract boolean resolve(int number);

    public abstract void done(int number);

    public final void support(int number) {
        if(resolve(number)) {
            done(number);
        } else if(nextReceiver != null) {
            nextReceiver.support(number);
        } else {
            System.out.println("그 어떤 객체도 처리하지 못함..");
        }
    }

}
