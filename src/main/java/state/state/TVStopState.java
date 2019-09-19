package state.state;

/**
 * Concrete State
 */
public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("------------------------------");
        System.out.println("TV is turned OFF.");
        System.out.println("------------------------------");
    }

}
