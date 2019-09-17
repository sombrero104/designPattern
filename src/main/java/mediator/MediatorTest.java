package mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediatorTest extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Command command = (Command)actionEvent.getSource();
        command.execute();
    }

    public static void main(String[] args) {
        MediatorTest mediatorTest = new MediatorTest();
        Mediator mediator = new ParticipantMediator();
        JPanel jPanel = new JPanel();
        jPanel.add(new ViewButton(mediatorTest, mediator));
        jPanel.add(new BookButton(mediatorTest, mediator));
        jPanel.add(new SearchButton(mediatorTest, mediator));
        mediatorTest.getContentPane().add(new Display(mediator), "North");
        mediatorTest.getContentPane().add(jPanel, "South");
        mediatorTest.setSize(400, 200);
        mediatorTest.setVisible(true);
    }

}
