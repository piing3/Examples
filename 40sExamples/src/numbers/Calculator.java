package numbers;

/**
 * A collection of useful methods for numbers
 * Author: Davin
 * Date: 22-Feb-2016
 * Teacher: Mr. Wachs 
 */
public class Calculator {
    /**
     * Calculates the factorial of a number
     * @param i the number to calculate
     * @return the factorial of the number
     */
    public static int factorial(int i){
        if (i <= 0) return 0;
        else if (i == 1) return 1;
        else return i * factorial(i-1);
    }
    /**
     * Calculates a number to the power of another
     * @param base the base number
     * @param power the exponent
     * @return the base to the power of the exponent
     */ 
    public static int power(int base, int power) {
        if (power == 0) return 0;
        else if (power == 1) return base;
        else return base * power(base, power-1);
    }

}
