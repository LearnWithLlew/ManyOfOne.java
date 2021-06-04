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
        for (int i = 1; i <= 1; i++) {
            var number1 = 1;
            output += i + ",";

        }
        var number2 = 2;
        output += number2 + ",";
        var number3 = 3;
        output += number3 + ",";
        var number4 = 4;
        output += number4 + ",";
        var number5 = 5;
        output += number5 + ",";
        var number6 = 6;
        output += number6 + ",";
        var number7 = 7;
        output += number7 + ",";
        return output;
    }
}
