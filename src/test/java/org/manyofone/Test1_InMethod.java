package org.manyofone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1_InMethod {
    @Test
    public void test1() {
        assertEquals("1,2,3,5,7,11,13,", printPrimes());
    }

    /**
     * Convert variable to many of one
     */
    private String printPrimes() {
        String output = "";
        int number1 = 1;
        output += number1 + ",";
        int number2 = 2;
        output += number2 + ",";
        int number3 = 3;
        output += number3 + ",";
        int number4 = 5;
        output += number4 + ",";
        int number5 = 7;
        output += number5 + ",";
        int number6 = 11;
        output += number6 + ",";
        int number7 = 13;
        output += number7 + ",";
        return output;
    }


    @Test
    public void test2() {
        assertEquals("1,2,3,4,5,6,7,", printNumbersUpTo7());
    }

    /**
     * Convert statement to loop of many of one
     */
    private String printNumbersUpTo7() {
        String output = "";
        int number1 = 1;
        output += number1 + ",";
        int number2 = 2;
        output += number2 + ",";
        int number3 = 3;
        output += number3 + ",";
        int number4 = 4;
        output += number4 + ",";
        int number5 = 5;
        output += number5 + ",";
        int number6 = 6;
        output += number6 + ",";
        int number7 = 7;
        output += number7 + ",";
        return output;
    }
}

