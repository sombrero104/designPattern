package chain.chain3;

public class DispenseTest {

    public static void main(String[] args) {
        DispenseChain dollar50Dispenser = new Dollar50Dispenser();
        DispenseChain dollar20Dispenser = new Dollar20Dispenser();
        DispenseChain dollar10Dispenser = new Dollar10Dispenser();
        DispenseChain dollar1Dispenser = new Dollar1Dispenser();

        dollar50Dispenser.setNextChain(dollar20Dispenser);
        dollar20Dispenser.setNextChain(dollar10Dispenser);
        dollar10Dispenser.setNextChain(dollar1Dispenser);

        System.out.println("--------------------------------");
        dollar50Dispenser.dispense(new Currency(387));
        System.out.println("--------------------------------");
    }

}
