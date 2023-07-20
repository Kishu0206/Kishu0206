package Firstassignmentjava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    class NotANumberException extends Exception {
        public NotANumberException(String message) {
            super(message);
        }
    }

    public class Mini_6_Q3 extends JFrame {
        private JTextField inputField;
        private JLabel resultLabel;

        public Mini_6_Q3() {
            setTitle("Palindrome Checker");
            setSize(300, 150);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            inputField = new JTextField(10);
            resultLabel = new JLabel();

            JButton checkButton = new JButton("Check Palindrome");
            checkButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String inputText = inputField.getText();
                        if (!inputText.matches("\\d+")) {
                            throw new NotANumberException("Please input numbers only");
                        }

                        int number = Integer.parseInt(inputText);
                        if (isPalindrome(number)) {
                            resultLabel.setText("Palindrome: Yes");
                        } else {
                            resultLabel.setText("Palindrome: No");
                        }
                    } catch (NotANumberException ex) {
                        resultLabel.setText(ex.getMessage());
                    }
                }
            });

            add(new JLabel("Enter a number: "));
            add(inputField);
            add(checkButton);
            add(resultLabel);

            setVisible(true);
        }

        public boolean isPalindrome(int number) {
            int originalNumber = number;
            int reversedNumber = 0;

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            return originalNumber == reversedNumber;
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new Mini_6_Q3();
                }
            });
        }

    }
