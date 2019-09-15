package chain.chain3;

public class Dollar1Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 1) {
            int count = currency.getAmount()/1;
            int remainder = currency.getAmount()%1;

            System.out.println("Dispensing " + count + " 1$ note.");

            if((remainder > 0) && (nextChain != null)) {
                this.nextChain.dispense(new Currency(remainder));
            }
        } else {
            if (nextChain != null) {
                this.nextChain.dispense(currency);
            } else {
                System.out.println("No dispenser could handle " + currency.getAmount() + "$.");
            }
        }
    }

}
