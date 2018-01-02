package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculator() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(45, 15.6);
        double sub = calculator.sub(45, 15.6);
        double mul = calculator.mul(45, 2.2);
        double div = calculator.div(45, 3);
        //Then
        Assert.assertEquals(60.6, add, 1);
        Assert.assertEquals(29.4, sub, 1);
        Assert.assertEquals(99, mul, 1);
        Assert.assertEquals(15, div, 1);
    }

    @Test
    public void testCalculatorDivisionByZero() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        try {
            double result = calculator.div(45, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0\n" + e);
        }
        //Then
        //do nothing
    }
}