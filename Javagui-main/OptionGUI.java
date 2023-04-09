import javax.swing.*;
import java.awt.*;

public class OptionGUI extends JFrame {
    private JPanel panel;
    private JRadioButton itButton, cseButton, eceButton;
    private ButtonGroup buttonGroup;

    public OptionGUI() {
        panel = new JPanel(new GridLayout(3, 1));
        itButton = new JRadioButton("IT");
        cseButton = new JRadioButton("CSE");
        eceButton = new JRadioButton("ECE");
        buttonGroup = new ButtonGroup();

        itButton.addActionListener(e -> {
            itButton.setSelected(true);
            cseButton.setSelected(false);
            eceButton.setSelected(false);
        });

        cseButton.addActionListener(e -> {
            itButton.setSelected(false);
            cseButton.setSelected(true);
            eceButton.setSelected(false);
        });

        eceButton.addActionListener(e -> {
            itButton.setSelected(false);
            cseButton.setSelected(false);
            eceButton.setSelected(true);
        });

        buttonGroup.add(itButton);
        buttonGroup.add(cseButton);
        buttonGroup.add(eceButton);

        panel.add(itButton);
        panel.add(cseButton);
        panel.add(eceButton);

        add(panel);
        setSize(200, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new OptionGUI();
    }
}
