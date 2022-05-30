package com.puer.infelix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowedCalculator {
    private JPanel panel;
    private JTextField firstNumberTextField;
    private JTextField secondNumberTextField;
    private JTextField resultTextField;
    private JButton clearButton;
    private JButton divideButton;
    private JButton multiplyButton;
    private JButton minusButton;
    private JButton plusButton;
    private JLabel charLabel;
    private JLabel equalsLabel;

    public WindowedCalculator() {
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (firstNumberTextField.getText().isEmpty() || secondNumberTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "Please, enter numbers.", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (firstNumberTextField.getText().matches("[0-9.]+") && secondNumberTextField.getText().matches("[0-9.]+")) {
                    float firstNumber = Float.parseFloat(firstNumberTextField.getText());
                    float secondNumber = Float.parseFloat(secondNumberTextField.getText());
                    resultTextField.setText(String.valueOf(firstNumber + secondNumber));
                    charLabel.setText("+");
                    equalsLabel.setText("=");
                } else {
                    JOptionPane.showMessageDialog(panel, "Please, enter valid numbers.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (firstNumberTextField.getText().isEmpty() || secondNumberTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "Please, enter numbers.", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (firstNumberTextField.getText().matches("[0-9.]+") && secondNumberTextField.getText().matches("[0-9.]+")) {
                    float firstNumber = Float.parseFloat(firstNumberTextField.getText());
                    float secondNumber = Float.parseFloat(secondNumberTextField.getText());
                    resultTextField.setText(String.valueOf(firstNumber - secondNumber));
                    charLabel.setText("-");
                    equalsLabel.setText("=");
                } else {
                    JOptionPane.showMessageDialog(panel, "Please, enter valid numbers.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (firstNumberTextField.getText().isEmpty() || secondNumberTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "Please, enter numbers.", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (firstNumberTextField.getText().matches("[0-9.]+") && secondNumberTextField.getText().matches("[0-9.]+")) {
                    float firstNumber = Float.parseFloat(firstNumberTextField.getText());
                    float secondNumber = Float.parseFloat(secondNumberTextField.getText());
                    resultTextField.setText(String.valueOf(firstNumber * secondNumber));
                    charLabel.setText("*");
                    equalsLabel.setText("=");
                } else {
                    JOptionPane.showMessageDialog(panel, "Please, enter valid numbers.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (firstNumberTextField.getText().isEmpty() || secondNumberTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "Please, enter numbers.", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (firstNumberTextField.getText().matches("[0-9.]+") && secondNumberTextField.getText().matches("[0-9.]+")) {
                    float firstNumber = Float.parseFloat(firstNumberTextField.getText());
                    float secondNumber = Float.parseFloat(secondNumberTextField.getText());
                    resultTextField.setText(String.valueOf(firstNumber / secondNumber));
                    charLabel.setText("/");
                    equalsLabel.setText("=");
                } else {
                    JOptionPane.showMessageDialog(panel, "Please, enter valid numbers.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                charLabel.setText("");
                equalsLabel.setText("");
                firstNumberTextField.setText("");
                secondNumberTextField.setText("");
                resultTextField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new WindowedCalculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setMinimumSize(new Dimension(600, 200));
        frame.setSize(new Dimension(600, 200));
        frame.setVisible(true);
    }
}
