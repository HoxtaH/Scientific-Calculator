package ioTyrellHoxter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tyrellhoxter on 5/10/16.
 */
public class CalculatorSpec {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.add(73);
        double expectedValue = 143;
        Assert.assertEquals("The expected value should be 126", actualValue, expectedValue, Math.ulp(.0001));
    }

    @Test
    public void subtract(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.subtract(50);
        double expectedValue = 30;
        Assert.assertEquals("The expected value should be 23", actualValue, expectedValue, Math.ulp(.0001));
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.multiply(9);
        double expectedValue = 81;
        Assert.assertEquals("Expected value should be 80", actualValue, expectedValue, Math.ulp(.0001));

    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.divide(81);
        double expectedValue = 9;
        Assert.assertEquals("Expected value should be 9", actualValue, expectedValue, Math.ulp(.0001));
    }

    @Test
    public void squareTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.square(10);
        double expectedValue = 100;
        Assert.assertEquals("The expected value should be 100", actualValue, expectedValue, Math.ulp(.0001));
    }

    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.squareRoot(81);
        double expectedValue = 9;
        Assert.assertEquals("The expected value should be 10", actualValue, expectedValue, Math.ulp(.0001));
    }

    @Test
    public void exponentTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.exponents(2,10);
        double expectedValue = 1024;
        Assert.assertEquals("The expected value is 100", actualValue, expectedValue, Math.ulp(.0001));
    }

    @Test
    public void inverseTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.inverse(-72);
        double expectedValue = 72;
        Assert.assertEquals("The expected value should be inverted", actualValue, expectedValue, Math.ulp(.0001));
    }

    @Test
    public void sineTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.sine(81);
        double expectedValue = -0.6298879942744539;
        Assert.assertEquals("The expected should be sine of 81", actualValue, expectedValue, Math.ulp(.0001));
    }

    @Test
    public void cosTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.cos(90);
        double expectedValue = -0.4480736161291702;
        Assert.assertEquals("The expected should be cos of 90", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void tanTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.tan(777);
        double expectedValue = 1.6525421724755398;
        Assert.assertEquals("The expected should be the tangent of 777", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void inverseSinTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.inverseSin(.90);
        double expectedValue = 1.1197695149986342;
        Assert.assertEquals("The expected should be the inverseSin of 800", expectedValue , actualValue, Math.ulp(.0001));
    }

    @Test
    public void inverseCosTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.inverseCos(.123);
        double expectedValue = 1.4474840516030247;
        Assert.assertEquals("The expected should be the inverseCos on .123", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void inverseTan(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.inverseTan(.80);
        double expectedValue = 0.6747409422235527;
        Assert.assertEquals("The expected should be the inverseTan of 157", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void logTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.log(9);
        double expectedValue = 2.1972245773362196;
        Assert.assertEquals("The expected should be the log of 9", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void log10XTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.log10X(9);
        double expectedValue = 0.9542425094393249;
        Assert.assertEquals("The expected should be the log10X of 9", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void logNaturalTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.logNatural(9);
        double expectedValue = 2.302585092994046;
        Assert.assertEquals("The expected should be the lognatural of 9", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void antiLogTest(){
        Calculator calculator = new Calculator();
        double actualValue = Calculator.antiLogarithm(.90);
        double expectedValue = 0.10536051565782628;
        Assert.assertEquals("The expected should be the antilog of .90", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void factorialTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.factorial(3);
        double expectedValue = 100;
        Assert.assertEquals("The expected should be the factorial of 10", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void randomMathTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.randomMath(5);
        double expectedValue = 3.609600290931386;
        Assert.assertEquals("The expected should be 100",expectedValue ,actualValue , Math.ulp(.0001));
    }

    @Test
    public void toDegreesTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.degrees(.7777);
        double expectedValue = 44.55892772732412;
        Assert.assertEquals("The expected value should be .777 in degrees", expectedValue, actualValue, Math.ulp(.0001));
    }

    @Test
    public void toRadiansTest(){
        Calculator calculator = new Calculator();
        double actualValue = calculator.radians(.9999);
        double expectedValue = 0.0174515471906913;
        Assert.assertEquals("The expected value shouled be .999 in radians", expectedValue, actualValue, Math.ulp(.0001));
    }
}
