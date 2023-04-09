//These are import statements that import necessary classes from the javax.swing and java.awt packages.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//This line declares a public class named CricketCounter, which extends the JFrame class and implements the ActionListener interface. This means that the CricketCounter class is a subclass of JFrame, which is the main window in a Java GUI, and also has the ability to handle action events, such as button clicks.
public class CricketCounter extends JFrame implements ActionListener {
    //These lines declare two private integer variables ballCount and overCount, which will be used to keep track of the number of balls and overs in a cricket match.
    private int ballCount = 0;
    private int overCount = 0;
    
    //These lines declare three private instance variables: ballLabel, overLabel, and countButton. These will be used to display the ball count, over count, and a button to increment the ball count.

    private JLabel ballLabel;
    private JLabel overLabel;
    private JButton countButton;

    //This is the constructor for the CricketCounter class. It sets the title of the JFrame to "Cricket Counter", sets the size of the window to 300x200 pixels, and sets the default close operation to JFrame.EXIT_ON_CLOSE (which means that the application will exit when the window is closed).

//The constructor then creates a JLabel for the ball count and over count, and a JButton for incrementing the ball count. It sets the text of the ball label and over label to "Balls: 0" and "Overs: 0", respectively. It also sets the text of the button to "Count Ball".

//The constructor then adds an action listener to the countButton object, which will listen for clicks on the button and call the actionPerformed() method when the button is clicked.

//Next, the constructor creates a JPanel object and sets its layout to a 3x1 grid. It then adds the ball label, over label, and count button to the panel.

//Finally, the constructor adds the panel to the JFrame and sets it to be visible.

    public CricketCounter() {
        super("Cricket Counter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ballLabel = new JLabel("Balls: " + ballCount);
        overLabel = new JLabel("Overs: " + overCount);
        countButton = new JButton("Count Ball");

        countButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(ballLabel);
        panel.add(overLabel);
        panel.add(countButton);

        add(panel);
        setVisible(true);
    }
    //This is the actionPerformed() method, which is called when the count button is clicked. It increments the ballCount variable by 1, and if ballCount is a multiple of 6 (i.e. if an over has been completed), it increments the overCount variable by 1.

//The method then updates the text of the ball label and over label to reflect the new values of ballCount and overCount, respectively.
    public void actionPerformed(ActionEvent e) {
        ballCount++;

        if (ballCount % 6 == 0) {
            overCount++;
        }

        ballLabel.setText("Balls: " + ballCount);
        overLabel.setText("Overs: " + overCount);
    }

    //The code declares a public static method named main, which is the entry point for the Java program. It takes an array of String objects named args as a parameter.

//Inside the main method, a new instance of the CricketCounter class is created and assigned to a variable named counter. This creates a new window with the title "Cricket Counter" and displays it on the screen.

//The main method doesn't return anything and is declared as void since it is the entry point of the program and the execution of the program starts from this point.
    
    public static void main(String[] args) {
        CricketCounter counter = new CricketCounter();
    }
}