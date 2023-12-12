package Practice20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CalculatorView {
    JFrame frame;
    private JTextField inputField;
    private JButton calculateButton;

    public CalculatorView() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        inputField = new JTextField();
        frame.add(inputField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        frame.add(buttonPanel, BorderLayout.CENTER);

        String[] buttons = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};

        for (String button : buttons) {
            JButton btn = new JButton(button);
            buttonPanel.add(btn);
        }

        calculateButton = new JButton("Calculate");
        frame.add(calculateButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public String getInputText() {
        return inputField.getText();
    }

    public void setResultText(String result) {
        inputField.setText(result);
    }

    public void addCalculateListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }
}

