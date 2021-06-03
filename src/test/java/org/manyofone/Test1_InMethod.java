package org.manyofone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1_InMethod {
    @Test
    public void test1() {
        assertEquals("1,2,3,5,7,11,13,", Exercise1.printPrimes());
    }


    @Test
    public void test2() {
        assertEquals("1,2,3,4,5,6,7,", Exercise1.printNumbersUpTo7());
    }

}

