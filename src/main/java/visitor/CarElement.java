package visitor;

/**
 * Element
 */
public interface CarElement {

    void accept(CarElementVisitor visitor);

}
