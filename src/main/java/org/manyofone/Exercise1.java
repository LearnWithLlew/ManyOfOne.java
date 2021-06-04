package org.manyofone;

public class Exercise1 {
    /**
     * Convert variable to many of one
     */
    public static String printPrimes() {
        String output = "";
        int[] number1 = {1,2,3,5,7,11,13};
        for (int i : number1) {
            output += i + ",";

        }

        return output;
    }

    /**
     * Convert statement to loop of many of one
     */
    public static String printNumbersUpTo7() {
        String output = "";
        for (int i = 1; i <= 7; i++) {
            output += i + ",";

        }

        return output;
    }
}
