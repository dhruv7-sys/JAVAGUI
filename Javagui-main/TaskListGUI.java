import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskListGUI extends JFrame implements ActionListener {
    private JTable taskTable;
    private DefaultTableModel taskTableModel;
    private JTextField nameField;
    private JTextArea descriptionArea;

    public TaskListGUI() {
        super("Task List");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create table for displaying tasks
        String[] columnNames = {"Task Name", "Description", "Status"};
        taskTableModel = new DefaultTableModel(columnNames, 0);
        taskTable = new JTable(taskTableModel);

        // Create panel for adding new task
        JPanel addTaskPanel = new JPanel(new GridLayout(3, 2));
        addTaskPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel nameLabel = new JLabel("Task Name:");
        nameField = new JTextField();
        JLabel descriptionLabel = new JLabel("Description:");
        descriptionArea = new JTextArea();
        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(this);
        addTaskPanel.add(nameLabel);
        addTaskPanel.add(nameField);
        addTaskPanel.add(descriptionLabel);
        addTaskPanel.add(descriptionArea);
        addTaskPanel.add(new JLabel());
        addTaskPanel.add(addButton);

        // Add components to main window
        add(new JScrollPane(taskTable), BorderLayout.CENTER);
        add(addTaskPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TaskListGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add Task")) {
            String name = nameField.getText();
            String description = descriptionArea.getText();
            if (!name.equals("")) {
                taskTableModel.addRow(new Object[]{name, description, "Incomplete"});
                nameField.setText("");
                descriptionArea.setText("");
            }
        }
    }
}
