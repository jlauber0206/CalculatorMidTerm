package Calculator;

/**
 * BasicCalculator class is the controller for the CalculatorMidTerm application
 */
public class BasicCalculator implements Calculator {
    /**
     * operation() method is using the switch case method for processing through all of the different operations that a calculator might be asked to perform
     *
     * @param double number1 - represents the first input from CalcMain being passed into the operation() method
     * @param double number2 - represents the last input from CalcMain being passed into the operation() method
     * @param char opSign  - represents the operator input from CalcMain being passed into the operation() method
     * @return double answer is returned and is different depending on the operator that is passed in via the opSign param
     */

    public double operation(double number1, double number2, char opSign) {
        double answer;

        switch (opSign) {
            case '+':
                answer = number1 + number2;
                break;
            case '-':
                answer = number1 - number2;
                break;
            case '*':
                answer = number1 * number2;
                break;
            case '/':
                if (number2 == 0)
                    throw new ArithmeticException("Can't divide by 0.");
                answer = number1 / number2;
                break;
            case '%':
                if (number2 == 0)
                    throw new ArithmeticException("Can't divide by 0.");
                answer = number1 % number2;
                break;
            case '^':
                answer = Math.pow(number1, number2);
                break;
            case '$':
                answer = Math.pow(number1, 1.0/number2);
                break;
            default:
                System.err.println("Invalid input!" + opSign);
                throw new IllegalArgumentException("Invalid input " + opSign);
        }
        return answer;
    }
}







