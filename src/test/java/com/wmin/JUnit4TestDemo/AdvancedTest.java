package com.wmin.JUnit4TestDemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdvancedTest {
    private static Calculator calculator=new Calculator();
    @Before
    public void setUp ()throws Exception{
        calculator.clear();
    }
    @Test(timeout = 2000)
    public void testSquareRoot() {
        calculator.squareRoot(4);
        assertEquals(2, calculator.getResult());
    }
    @Test(expected=ArithmeticException.class )
    public  void  divideByZero()  {

        calculator.divide( 0 );

    }
}
