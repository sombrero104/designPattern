package mediator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * A concrete colleague
 */
public class SearchButton extends JButton implements Command {
    Mediator mediator;

    public SearchButton(ActionListener actionListener, Mediator mediator) {
        super("Search");
        addActionListener(actionListener);
        this.mediator = mediator;
        this.mediator.registerSearch(this);
    }

    @Override
    public void execute() {
        mediator.search();
    }

}
