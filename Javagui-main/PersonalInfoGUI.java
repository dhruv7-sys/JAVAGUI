import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PersonalInfoGUI extends JFrame implements ActionListener {

    // Declare GUI components
    private JLabel nameLabel, ageLabel, addressLabel;
    private JTextField nameTextField, ageTextField, addressTextField;
    private JButton submitButton;

    public PersonalInfoGUI() {
        // Set window properties
        setTitle("Personal Information");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize GUI components
        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        addressLabel = new JLabel("Address:");
        nameTextField = new JTextField(20);
        ageTextField = new JTextField(3);
        addressTextField = new JTextField(30);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Add components to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(4, 2));
        contentPane.add(nameLabel);
        contentPane.add(nameTextField);
        contentPane.add(ageLabel);
        contentPane.add(ageTextField);
        contentPane.add(addressLabel);
        contentPane.add(addressTextField);
        contentPane.add(submitButton);

        // Display the window
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Retrieve user input and display it in a separate window
            String name = nameTextField.getText();
            int age = Integer.parseInt(ageTextField.getText());
            String address = addressTextField.getText();

            JFrame infoWindow = new JFrame("Personal Information");
            infoWindow.setSize(400, 200);
            infoWindow.setLocationRelativeTo(null);

            JTextArea infoTextArea = new JTextArea();
            infoTextArea.setEditable(false);
            infoTextArea.append("Name: " + name + "\n");
            infoTextArea.append("Age: " + age + "\n");
            infoTextArea.append("Address: " + address);

            JScrollPane scrollPane = new JScrollPane(infoTextArea);

            infoWindow.getContentPane().add(scrollPane);

            infoWindow.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new PersonalInfoGUI();
    }
}
