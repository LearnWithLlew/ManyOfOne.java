package org.manyofone;

import com.github.larseckart.tcr.FastTestCommitRevertMainExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(FastTestCommitRevertMainExtension.class)
public class Test2_PassingArrays {

        @Test
        public void test1()
        {
            assertEquals("#1\n", Exercise2.merge("#", 1));
        }

       @Test
        public void testManyNumbers()
        {
            var expected = removeIndentation("""
                #1
                #2
                #3
                #4
                #5
            """);
            // assertEquals(expected, Exercise2.merge("#", 1 ,2,3,4,5));
        }

    private static String removeIndentation(String s) {
            return s.replaceAll("    ","");
    }

}

