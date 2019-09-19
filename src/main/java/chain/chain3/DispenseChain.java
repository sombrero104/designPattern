package chain.chain3;

/**
 * Handler
 */
public interface DispenseChain {

    public void setNextChain(DispenseChain nextChain);

    public void dispense(Currency currency);

}
