import javax.swing.*;
import java.awt.*;

public class TableGUI extends JFrame {
    private JLabel[][] labels;
    private JPanel panel;

    public TableGUI() {
        String[][] data = {{"1", "John", "Doe"}, {"2", "Jane", "Doe"}, {"3", "Bob", "Smith"}};
        String[] headers = {"ID", "First Name", "Last Name"};

        int numRows = data.length;
        int numCols = headers.length;

        panel = new JPanel(new GridLayout(numRows + 1, numCols));

        labels = new JLabel[numRows + 1][numCols];
        for (int i = 0; i < numCols; i++) {
            labels[0][i] = new JLabel(headers[i]);
            panel.add(labels[0][i]);
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                labels[i + 1][j] = new JLabel(data[i][j]);
                panel.add(labels[i + 1][j]);
            }
        }

        add(panel);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TableGUI();
    }
}
