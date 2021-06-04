package org.manyofone;

public class Exercise2 {
    public static String merge(String prefix, int... number) {
        String output = "";
        for (int i : number) {

            output += prefix + i + "\n";
        }
        return output;
    }
}
