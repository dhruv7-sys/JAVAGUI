import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorPicker extends JFrame implements ActionListener {

    JButton btnColorPicker;
    JPanel colorPanel;

    public ColorPicker() {
        super("Color Picker");
        setLayout(new FlowLayout());

        btnColorPicker = new JButton("Pick a color");
        btnColorPicker.addActionListener(this);

        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(100, 100));
        colorPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        add(btnColorPicker);
        add(colorPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Color color = JColorChooser.showDialog(this, "Choose a color", Color.BLACK);
        if (color != null) {
            colorPanel.setBackground(color);
        }
    }

    public static void main(String[] args) {
        new ColorPicker();
    }
}
