package memento;

/**
 * Originator
 * (오리지네이터)
 */
public class Originator {
    private String state;

    public void set(String state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);
    }

    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    /**
     * Memento
     * (메멘토)
     */
    public static class Memento {
        private final String state;

        public Memento(String state) {
            this.state = state;
        }

        /**
         * Accessible by outer class only
         */
        private String getSavedState() {
            return state;
        }

    }

}
