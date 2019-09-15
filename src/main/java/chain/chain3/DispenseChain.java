package chain.chain3;

public interface DispenseChain {

    public void setNextChain(DispenseChain nextChain);

    public void dispense(Currency currency);

}
