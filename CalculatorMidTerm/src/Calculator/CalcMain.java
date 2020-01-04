package Calculator;

import java.util.Scanner;

import static java.lang.Math.E;
import static java.lang.Math.PI;

public class CalcMain {


    /**
     * @param String[] args this is the entry point of the application
     */
    public static void main(String[] args) {
        //input is going to be the UI of this application/User will input information
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        String firstInput = input.nextLine();
        System.out.print("Please enter the operation you wish to perform: ");
        String secondInput = input.nextLine();
        System.out.print("Please enter an integer: ");
        String lastInput = input.nextLine();
        if (firstInput.equalsIgnoreCase("Help") || secondInput.equalsIgnoreCase("Help") || lastInput.equalsIgnoreCase("Help")) {
            printHelp();
        } else {
            try {
                double number1 = parseValue(firstInput);
                char opSign = secondInput.charAt(0);
                double number2 = parseValue(lastInput);
                BasicCalculator calcController = new BasicCalculator();
                double answer = calcController.operation(number1, number2, opSign);
                String operatorDisplay = String.valueOf(opSign);

                System.out.printf("%nResult:  %.2f " + operatorDisplay + " " + "%.2f = %.2f%n", number1, number2, answer);
            } catch (NumberFormatException e) {
                System.err.print("Inputs need to be valid numbers.");
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.err.print(e.getMessage());
            }
        }
    }
    /**
     * parseValue() method looks at the input values to see if they are either E or PI
     *
     * @param double input - is used to evaluate if input values are either E or PI and if not then pass the entered value as default
     * @return Double input
     */
    private static double parseValue(String input) {
        if (input.equalsIgnoreCase("E")) {
            return E;
        } else if (input.equalsIgnoreCase("PI")) {
            return PI;
        } else {
            return Double.valueOf(input);
        }
    }
    /**
     * printHelp() method gives the user assistance if needed in how to properly utilize the Calculator application
     */
    private static void printHelp() {
        System.out.print(
                "Help\n" +
                        "Calculator Assistance:\n" +
                        "\n" +
                        "First and Last Input - these inputs will accept only numbers, decimals, and/or vales PI/e\n" +
                        "\n" +
                        "Second Input - is the operator input and only accepts the following:\n" +
                        "\n" +
                        "\t1. '+' - this is the addition operator and will add the First Input and Last Input\n" +
                        "\n" +
                        "\t2. '-' - this is the subtraction operator and will subtract the First Input from the Last Input\n" +
                        "\n" +
                        "\t3. '*' - this is the multiplication operator and will multiply the First Input by the Last Input\n" +
                        "\n" +
                        "\t4. '/' - this is the division operator and will divide the First Input by the Last Input\n" +
                        "\t       - this operator cannot have a Last Input of 0...please enter any other number or PI/e\n" +
                        "\n" +
                        "\t5. '%' - this is the modulous operator and will divide the First Input by the Last Input with an ouput as the Remainder\n" +
                        "               - this operator cannot have a Last Input of 0...please enter anyother number or PI/e\n" +
                        "\n" +
                        "\t6. '^' - this is the power operator and will raise the First Input to the power of the Last Input" +
                        "\t7. '$' - this is the nth operator and the First Input = the base and the Last Input = the exponent\n");

    }
}


