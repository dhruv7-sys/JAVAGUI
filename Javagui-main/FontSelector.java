import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontSelector extends JFrame implements ActionListener {

    private JLabel label;
    private JComboBox<String> fontBox, styleBox, sizeBox;

    public FontSelector() {
        setTitle("Font Selector");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // create font box
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        fontBox = new JComboBox<>(fontNames);
        fontBox.addActionListener(this);
        panel.add(fontBox);

        // create style box
        String[] styles = {"Plain", "Bold", "Italic", "Bold Italic"};
        styleBox = new JComboBox<>(styles);
        styleBox.addActionListener(this);
        panel.add(styleBox);

        // create size box
        String[] sizes = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"};
        sizeBox = new JComboBox<>(sizes);
        sizeBox.addActionListener(this);
        panel.add(sizeBox);

        // create label to display text
        label = new JLabel("Sample Text", JLabel.CENTER);
        label.setFont(new Font(fontNames[0], Font.PLAIN, 12));
        panel.add(label);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String fontName = (String) fontBox.getSelectedItem();
        int fontStyle = Font.PLAIN;
        switch ((String) styleBox.getSelectedItem()) {
            case "Plain": fontStyle = Font.PLAIN; break;
            case "Bold": fontStyle = Font.BOLD; break;
            case "Italic": fontStyle = Font.ITALIC; break;
            case "Bold Italic": fontStyle = Font.BOLD + Font.ITALIC; break;
        }
        int fontSize = Integer.parseInt((String) sizeBox.getSelectedItem());

        label.setFont(new Font(fontName, fontStyle, fontSize));
    }

    public static void main(String[] args) {
        new FontSelector();
    }
}
