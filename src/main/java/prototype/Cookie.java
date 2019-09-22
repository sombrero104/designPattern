package prototype;

/**
 * Prototype
 */
public class Cookie implements Cloneable {

    public Object clone() {
        try {
            Cookie copy = (Cookie)super.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
