import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAnalyzer extends JFrame {
    private JTextArea textArea;
    private JLabel charCountLabel;
    private JLabel wordCountLabel;
    private JLabel lineCountLabel;

    public TextAnalyzer() {
        setTitle("Text Analyzer");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create text area for user input
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create labels for displaying analysis results
        charCountLabel = new JLabel("Characters: 0");
        wordCountLabel = new JLabel("Words: 0");
        lineCountLabel = new JLabel("Lines: 0");

        // Create button to trigger analysis
        JButton analyzeButton = new JButton("Analyze");
        analyzeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                analyzeText();
            }
        });

        // Create panel for labels and button
        JPanel analysisPanel = new JPanel(new GridLayout(1, 4));
        analysisPanel.add(charCountLabel);
        analysisPanel.add(wordCountLabel);
        analysisPanel.add(lineCountLabel);
        analysisPanel.add(analyzeButton);

        // Add components to frame
        Container contentPane = getContentPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(analysisPanel, BorderLayout.SOUTH);
    }

    private void analyzeText() {
        // Get the text from the text area
        String text = textArea.getText();

        // Count characters
        int charCount = text.length();
        charCountLabel.setText("Characters: " + charCount);

        // Count words
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        wordCountLabel.setText("Words: " + wordCount);

        // Count lines
        int lineCount = text.split("\n").length;
        lineCountLabel.setText("Lines: " + lineCount);
    }

    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();
        analyzer.setVisible(true);
    }
}
