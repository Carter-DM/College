package javacp2560.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Frame extends JFrame {
    Map<String, String> map = new HashMap<>();
    JTextField nameField = new JTextField(10);
    JTextField phoneField = new JTextField(10);
    JTextField nameEntryField = new JTextField(20);
    JTextArea displayArea = new JTextArea();

    public Frame(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Listener listener = new Listener();
        setSize(400, 400);
        setLayout(new BorderLayout());

        JPanel userInputPanel = new JPanel();
        userInputPanel.setLayout(new FlowLayout());
        add(userInputPanel, BorderLayout.NORTH);

        JLabel nameLabel = new JLabel("Full Name:");
        userInputPanel.add(nameLabel);

        nameField.addActionListener(listener);
        userInputPanel.add(nameField);

        JLabel phoneLabel = new JLabel("Phone Number:");
        userInputPanel.add(phoneLabel);

        phoneField.addActionListener(listener);
        userInputPanel.add(phoneField);

        JPanel nameEntryPanel = new JPanel();
        nameEntryPanel.setLayout(new FlowLayout());
        add(nameEntryPanel, BorderLayout.CENTER);
        JLabel nameEntryLabel = new JLabel("Enter a name to lookup their phone number: ");
        nameEntryPanel.add(nameEntryLabel);
        nameEntryField.addActionListener(listener);
        nameEntryPanel.add(nameEntryField);

        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setPreferredSize(new Dimension(375, 250));
        add(scrollPane, BorderLayout.SOUTH);
    }

    private class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if ((e.getSource() == nameField) || (e.getSource() == phoneField)) {
                map.put(nameField.getText(), phoneField.getText());
                displayArea.append("\n");
                for (Map.Entry<String, String> entry : map.entrySet()){
                    displayArea.append(entry.getValue() + "\n");
                }
            }
            else if (e.getSource() == nameEntryField) {
                if (map.containsKey(nameEntryField.getText())) {
                    displayArea.append("\nPhone Number for " + nameEntryField.getText() + ": " + map.get(nameEntryField.getText()) + "\n");
                }
                else {
                    displayArea.append("\nUser '" + nameEntryField.getText() + "' not found.\n");
                }
            }
        }
    }
}


