package visitor;

/**
 * Concrete element
 */
public class Engine implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }

}
