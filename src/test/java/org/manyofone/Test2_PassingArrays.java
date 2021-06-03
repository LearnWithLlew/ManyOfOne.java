package org.manyofone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2_PassingArrays {

        @Test
        public void test1()
        {
            assertEquals("#1\n", Exercise2.merge("#", 1));
        }

    // @Test
        public void Test2()
        {
            var expected = """
                #1
                #2
                #3
                #4
                #5
            """;
            assertEquals(expected, Exercise2.merge("#", 1 /*,2,3,4,5*/));
        }

    }

