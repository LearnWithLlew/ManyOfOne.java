package org.manyofone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test3_PassingObjects {
    @Test
    public void test1HardCodedFormat() {
        assertEquals("#1", Exercise3.format(1));
    }

    //@Test
    public void test2AllowForCustomPrefix() {
        assertEquals("*1", Exercise3.format(1 /*, ? */));
    }

    //@Test
    public void test3AllowForCustomPrefixAndSuffix() {
        var expected = "#1)";
        assertEquals(expected, Exercise3.format(1 /*, ?*/));
    }


}
