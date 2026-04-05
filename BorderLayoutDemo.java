import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

    public void method() {

        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // NORTH region
        JLabel titleLabel = new JLabel("Application Title", JLabel.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        // WEST region
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3, 1));

        JButton button1 = new JButton("Option 1");
        JButton button2 = new JButton("Option 2");
        JButton button3 = new JButton("Option 3");

        westPanel.add(button1);
        westPanel.add(button2);
        westPanel.add(button3);

        frame.add(westPanel, BorderLayout.WEST);

        // CENTER region
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // SOUTH region
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton, BorderLayout.SOUTH);

        // Make frame visible
        frame.setVisible(true);
    }
}