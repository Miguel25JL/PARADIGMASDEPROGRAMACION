package INTERFACESENJAVA.Entrada_y_salida_simple;

// Fig. 12.2: Addition.java
// Addition program that uses JOptionPane for input and output
import javax.swing.JOptionPane;

public class Addition
{
    public static void main(String[] args)
    {
        // get user input from JOptionPane input dialogs
        String firstNumber =
                JOptionPane.showInputDialog("Enter the first integer");
        String secondNumber =
                JOptionPane.showInputDialog("Enter the second integer");

        // convert String inputs to int values for use in a calculation
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        // display result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum is " + sum,
                "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
} // end class Addition