package com.wmin.JUnit4TestDemo;
import  org.junit.runner.RunWith;
import  org.junit.runners.Suite;

@RunWith(Suite.class )
@Suite.SuiteClasses( {
        CalculatorTest.class ,
        SquareTest.class,
        AdvancedTest.class
} )
public class AllCalculatorTests {
}
