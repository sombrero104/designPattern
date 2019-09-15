package chain.chain3;

public class Dollar10Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10) {
            int count = currency.getAmount()/10;
            int remainder = currency.getAmount()%10;

            System.out.println("Dispensing " + count + " 10$ note.");

            if((remainder > 0) && (nextChain != null)) {
                this.nextChain.dispense(new Currency(remainder));
            }
        } else {
            if(nextChain != null) {
                this.nextChain.dispense(currency);
            } else {
                System.out.println("No dispenser could handle " + currency.getAmount() + "$.");
            }

        }
    }

}
