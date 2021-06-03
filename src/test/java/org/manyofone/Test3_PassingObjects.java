package org.manyofone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test3_PassingObjects {
    @Test
    public void test1HardCodedFormat() {
        assertEquals("#1", format(1));
    }

    //@Test
    public void test2AllowForCustomPrefix() {
        assertEquals("*1", format(1 /*, ? */));
    }

    //@Test
    public void test3AllowForCustomPrefixAndSuffix() {
        var expected = "#1)";
        assertEquals(expected, format(1 /*, ?*/));
    }

    private String format(int number) {
        return "#" + number;
    }

    public static class Options {
    }
}
