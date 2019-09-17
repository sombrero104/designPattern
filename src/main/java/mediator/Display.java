package mediator;

import javax.swing.*;
import java.awt.*;

public class Display extends JLabel {
    Mediator mediator;

    public Display(Mediator mediator) {
        super("Just started..");
        this.mediator = mediator;
        this.mediator.registerDisplay(this);
        setFont(new Font("Arial", Font.BOLD, 24));
    }

}
