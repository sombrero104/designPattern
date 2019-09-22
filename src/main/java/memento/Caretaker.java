package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker
 * (케어테이커)
 */
public class Caretaker {

    public static void main(String[] args) {
        List<Originator.Memento> mementoList = new ArrayList<>();
        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        mementoList.add(originator.saveToMemento()); // State2 상태인 메멘토가 리스트에 추가됨.
        originator.set("State3");
        mementoList.add(originator.saveToMemento()); // State3 상태인 메멘토가 리스트에 추가됨.
        originator.set("State4");
        originator.restoreFromMemento(mementoList.get(1));
        originator.restoreFromMemento(mementoList.get(0));
        originator.restoreFromMemento(mementoList.get(1));
    }

}
