import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2, b3, b4;
    calculator() {
        setLayout(null);

        l1 = new JLabel("Simple calculator"); 
        l1.setBounds(100, 10, 300, 30);  
        l1.setFont(new Font("Times New Roman", Font.BOLD,30));
        add(l1);

        l2 = new JLabel("");
        l2.setBounds(100, 300, 300, 50);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(l2);

        t1 = new JTextField(100);
        t2 = new JTextField(100);

        b1 = new JButton("ADD");
        b2 = new JButton("SUBTRACT");
        b3 = new JButton("MULTIPLY");
        b4 = new JButton("DIVIDE");

        t1.setBounds(100, 80, 200, 30);
        t2.setBounds(100, 120, 200, 30);
        add(t1);
        add(t2);

        b1.setBounds(40, 180, 120, 30);
        b2.setBounds(40, 230, 120, 30);
        b3.setBounds(200, 180, 120, 30);
        b4.setBounds(200, 230, 120, 30);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                l2.setText("SUM = "+ (num1 + num2));
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                l2.setText("DIFFERENCE = "+ (num1 - num2));
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                l2.setText("PRODUCT = "+ (num1 * num2));
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                l2.setText("DIVISION = "+ (num1 / num2));
            }
        });
        
    }
}
class SimpleCalculator {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.setVisible(true);
        c.setTitle("Calculator");
        c.setBounds(100, 100, 400, 400); //Dimensions of JFrame
    } 
}