import javax.swing.*;
import java.awt.*;

public class TrafficLight extends JFrame {
    private JPanel panel;
    private JButton redButton, yellowButton, greenButton;

    public TrafficLight() {
        panel = new JPanel(new GridLayout(3, 1));
        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        greenButton = new JButton("Green");

        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);

        redButton.setBackground(Color.RED);
        yellowButton.setBackground(Color.YELLOW);
        greenButton.setBackground(Color.GREEN);

        redButton.setOpaque(true);
        yellowButton.setOpaque(true);
        greenButton.setOpaque(true);

        redButton.addActionListener(e -> {
            redButton.setBackground(Color.RED);
            yellowButton.setBackground(null);
            greenButton.setBackground(null);
        });

        yellowButton.addActionListener(e -> {
            redButton.setBackground(null);
            yellowButton.setBackground(Color.YELLOW);
            greenButton.setBackground(null);
        });

        greenButton.addActionListener(e -> {
            redButton.setBackground(null);
            yellowButton.setBackground(null);
            greenButton.setBackground(Color.GREEN);
        });

        add(panel);
        setSize(200, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
