package mediator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * A concrete colleague
 */
public class BookButton extends JButton implements Command {
    Mediator mediator;

    public BookButton(ActionListener actionListener, Mediator mediator) {
        super("Book");
        addActionListener(actionListener);
        this.mediator = mediator;
        this.mediator.registerBook(this);
    }

    @Override
    public void execute() {
        mediator.book();
    }

}
