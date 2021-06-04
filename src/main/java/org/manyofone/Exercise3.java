package org.manyofone;

public class Exercise3 {
    public static  String format(int number) {
        FormatOptions options = new FormatOptions();
        return format(number,options);
    }

    public static String format(int number, FormatOptions options) {
        return "#" + number;
    }
}
