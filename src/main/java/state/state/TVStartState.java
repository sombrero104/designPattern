package state.state;

/**
 * Concrete State
 */
public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("------------------------------");
        System.out.println("TV is turned ON.");
        System.out.println("------------------------------");
    }

}
