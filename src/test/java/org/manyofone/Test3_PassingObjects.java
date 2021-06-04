package org.manyofone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test3_PassingObjects {
    @Test
    public void test1HardCodedFormat() {
        assertEquals("#1", Exercise3.format(1));
    }

    @Test
    public void test2AllowForCustomPrefix() {
        var expected = "*1";
         var actual = Exercise3.format(1 , new FormatOptions(){{prefix = "*";}});
        assertEquals(expected, actual);
    }

    @Test
    public void test3AllowForCustomSuffix() {
        var expected = "#1)";
        var actual =  Exercise3.format(1 , new FormatOptions(){{suffix = ")";}});
        assertEquals(expected,actual);
    }

    @Test
    public void test3AllowForCustomPrefixAndSuffix() {
        var expected = "<li>1</li>";
        var actual = new FormatOptions(){{prefix = "<li>";suffix = "</li>";}};
        assertEquals(expected, Exercise3.format(1 , actual));
    }


}
