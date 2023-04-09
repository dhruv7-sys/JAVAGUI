//The lines import the necessary packages for creating the graphical user interface.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//The lines declares a class named PalindromeChecker that extends JFrame and implements the ActionListener interface.
//The lines define a constructor for the PalindromeChecker class that sets the window title, size, and close operation.
public class PalindromeChecker extends JFrame implements ActionListener {
    //The lines declare three instance variables of the class PalindromeChecker: two JTextField objects for taking input from the user and a JLabel object to display the result of the palindrome check.
    private JTextField inputField1;
    private JTextField inputField2;
    private JLabel resultLabel;
    // lines define a constructor for the PalindromeChecker class that sets the window title, size, and close operation.
    public PalindromeChecker() {
        super("Palindrome Checker");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // lines create two JLabel objects to label the two input fields and two JTextField objects to take input from the user.

        JLabel inputLabel1 = new JLabel("Input 1:");
        JLabel inputLabel2 = new JLabel("Input 2:");
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);

        //The lines create a JButton object with the label "Check Palindromes" and add an ActionListener to it.

        JButton checkButton = new JButton("Check Palindromes");
        checkButton.addActionListener(this);


        //The above lines create a JLabel object to display the result of the palindrome check and center-align its text.

        resultLabel = new JLabel("Results");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //The lines create a JPanel object with a grid layout and add the input labels, input fields, check button, and result label to it. The panel is then added to the JFrame and the window is set to be visible.

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);
        panel.add(checkButton);
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }
    //The method is called when the user clicks the check button. It gets the text from the input fields, checks if they are palindromes using the isPalindrome method, and sets the text and color of the result label based on the result of the check.

    public void actionPerformed(ActionEvent e) {
        String input1 = inputField1.getText();
        String input2 = inputField2.getText();

        if (isPalindrome(input1) && isPalindrome(input2)) {
            resultLabel.setText("Both are palindromes");
            resultLabel.setForeground(Color.GREEN);
        } else if (isPalindrome(input1) || isPalindrome(input2)) {
            resultLabel.setText("One is a palindrome");
            resultLabel.setForeground(Color.BLUE);
        } else {
            resultLabel.setText("Neither is a palindrome");
            resultLabel.setForeground(Color.RED);
        }
    }

    private boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
    }
}
