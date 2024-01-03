import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorExample {
    private static TextField textField1;
    private static TextField textField2;
    private static Label resultLabel;

    public static void main(String[] args) {
        Frame frame = new Frame("Simple Calculator");
        frame.setSize(300, 400);

        // Initialize components
        textField1 = new TextField();
        textField2 = new TextField();
        resultLabel = new Label("Result: ");

        Button addButton = new Button("+");
        Button subtractButton = new Button("-");

        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");
        Button clearButton = new Button("Clear");

        // Add components to the frame
        frame.setLayout(new GridLayout(4, 2));
        // frame.add(new Label("Number 1: "));
        frame.add(textField1);
        // frame.add(new Label("Number 2: "));
        frame.add(textField2);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(clearButton);
        frame.add(resultLabel);

        // ActionListener for addition
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult('+');
            }
        });

        // ActionListener for subtraction
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult('-');
            }
        });

        // ActionListener for multiplication
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult('*');
            }
        });

        // ActionListener for division
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult('/');
            }
        });

        // ActionListener for clearing
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                resultLabel.setText("Result: ");
            }
        });

        // WindowListener to handle window close event
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    private static void calculateResult(char operator) {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid Input");
        }
    }
}
