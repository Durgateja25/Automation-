package com.Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.calculator.Calculator;

public class Calculator_Test {

    Calculator calc = new Calculator();

    @Test(priority = 1)
    public void testAddition() {
        Assert.assertEquals(calc.add(10, 5), 15);
    }

    @Test(priority = 2)
    public void testSubtraction() {
        Assert.assertEquals(calc.subtract(10, 5), 5);
    }

    @Test(priority = 3)
    public void testMultiplication() {
        Assert.assertEquals(calc.multiply(10, 5), 50);
    }

    @Test(priority = 4)
    public void testDivision() {
        Assert.assertEquals(calc.divide(10, 5), 2);
    }

}
