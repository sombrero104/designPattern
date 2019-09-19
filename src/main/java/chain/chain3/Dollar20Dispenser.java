package chain.chain3;

/**
 * Concrete Handler
 */
public class Dollar20Dispenser implements DispenseChain {
    private DispenseChain nextchain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextchain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20) {
            int count = currency.getAmount()/20;
            int remainder = currency.getAmount()%20;

            System.out.println("Dispensing " + count + " 20$ note.");

            if((remainder > 0) && (nextchain != null)) {
                this.nextchain.dispense(new Currency(remainder));
            }
        } else {
            if (nextchain != null) {
                this.nextchain.dispense(currency);
            } else {
                System.out.println("No dispenser could handle " + currency.getAmount() + "$.");
            }
        }
    }

}
