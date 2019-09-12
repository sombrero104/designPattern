package compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackableList = new ArrayList<>();

    public void add(Quackable quackable) {
        quackableList.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackableList.iterator();
        while(iterator.hasNext()) {
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

}
