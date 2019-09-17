package mediator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * A concrete colleague
 */
public class ViewButton extends JButton implements Command {
    Mediator mediator;

    public ViewButton(ActionListener actionListener, Mediator mediator) {
        super("View");
        addActionListener(actionListener);
        this.mediator = mediator;
        this.mediator.registerView(this);
    }

    @Override
    public void execute() {
        mediator.view();
    }

}
