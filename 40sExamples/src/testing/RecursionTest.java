package testing;

import numbers.Calculator;

/**
 * Tests the recursion unit
 * Author: Davin
 * Date: 22-Feb-2016
 * Teacher: Mr. Wachs 
 */
public class RecursionTest {

    public RecursionTest() {
        int i = Calculator.factorial(5);
        System.out.println("5! = "+i);
        
        int j = Calculator.power(5,3);
        System.out.println("5^3 = "+j);
    }
}
