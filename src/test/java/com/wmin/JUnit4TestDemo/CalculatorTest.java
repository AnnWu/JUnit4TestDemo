package com.wmin.JUnit4TestDemo;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private static Calculator calculator=new Calculator();
    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }
    @Test     //@Test表示自己要测试的方法
    public void testAdd() {
        calculator.add(2);
        calculator.add(3);
        System.out.println("输出加法运算结果："+calculator.getResult());
        assertEquals(5, calculator.getResult());
    }

    @Test
    public void testSubstract() {
        calculator.add(10);
        calculator.substract(2);
        System.out.println("输出加法与减法混合后的运算结果："+calculator.getResult());
        assertEquals(8, calculator.getResult());
    }
    @Ignore("Multiply() Not yet implemented")
    @Test
    public void testMultiply() {
        System.out.println("乘法运算方法未实现！");  //被忽略的方法将不会执行
    }

    @Test
    public void testDivide() {
        calculator.add(8);
        calculator.divide(2);
        System.out.println("输出加法与除法混合后的运算结果："+calculator.getResult());
        assertEquals(4, calculator.getResult());
    }
}