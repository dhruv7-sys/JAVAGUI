import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CaesarCipherGUI extends JFrame {
    private JTextField textField;
    private JButton encryptButton;
    private JTextArea resultArea;
    
    public CaesarCipherGUI() {
        super("Caesar Cipher Encryption");
        
        // Set up GUI components
        textField = new JTextField(20);
        encryptButton = new JButton("Encrypt");
        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
        
        // Add components to content pane
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Enter text to encrypt:"));
        topPanel.add(textField);
        topPanel.add(encryptButton);
        c.add(topPanel, BorderLayout.NORTH);
        c.add(new JScrollPane(resultArea), BorderLayout.CENTER);
        
        // Attach event listeners
        encryptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String plainText = textField.getText();
                String cipherText = encrypt(plainText, 3);  // Use shift of 3 for demonstration purposes
                resultArea.setText(cipherText);
            }
        });
        
        // Set window properties and display
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    // Helper method to encrypt a string using the Caesar cipher algorithm with a given shift value
    private String encrypt(String plainText, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char)(((c - base + shift) % 26) + base);
            }
            result.append(c);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        new CaesarCipherGUI();
    }
}
