package visitor;

public class Car implements CarElement {
    CarElement[] carElements;

    public Car() {
        this.carElements = new CarElement[] {
                new Wheel("front left")
                , new Wheel("front right")
                , new Wheel("back left")
                , new Wheel("back right")
                , new Body()
                , new Engine()
        };
    }

    public CarElement[] getCarElements() {
        // Return a copy of the array of references.
        return carElements.clone();
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for(CarElement carElement : this.getCarElements()) {
            carElement.accept(visitor);
        }
        visitor.visit(this);
    }

}
