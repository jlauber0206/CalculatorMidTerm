package Calculator;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorTest {

    @Test
    public void testAddition() {
        BasicCalculator basicCalculator = new BasicCalculator();
        double actual = basicCalculator.operation(12, 12, '+');
        Assert.assertEquals(24, actual, 0);
    }

    @Test
    public void testSubtraction() {
        BasicCalculator basicCalculator = new BasicCalculator();
        double actual = basicCalculator.operation(26, 13, '-');
        Assert.assertEquals(13, actual, 0);
    }

    @Test
    public void testMultiplication() {
        BasicCalculator calculatorController1 = new BasicCalculator();
        double actual = calculatorController1.operation(4, 4, '*');
        Assert.assertEquals(16, actual, 0);
    }

    @Test
    public void testDivision() {
        BasicCalculator basicCalculator = new BasicCalculator();
        double actual = basicCalculator.operation(22, 4, '/');
        Assert.assertEquals(5.5, actual, 0);
    }

    @Test
    public void testModulo() {
        BasicCalculator basicCalculator = new BasicCalculator();
        double actual = basicCalculator.operation(98, 4, '%');
        Assert.assertEquals(2, actual, 0);
    }

    @Test
    public void testPower() {
        BasicCalculator basicCalculator = new BasicCalculator();
        double actual = basicCalculator.operation(2, 4, '^');
        Assert.assertEquals(16, actual, 0);
    }

    @Test
    public void testNthPower() {
        BasicCalculator basicCalculator = new BasicCalculator();
        double actual = basicCalculator.operation(81, 4, '$');
        Assert.assertEquals(3, actual, 0);

    }


}





