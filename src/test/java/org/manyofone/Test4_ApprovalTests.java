package org.manyofone;

import org.approvaltests.Approvals;
import org.approvaltests.legacycode.Range;
import org.junit.jupiter.api.Test;

public class Test4_ApprovalTests {
    @Test
    /**
     * Convert verify to many of one
     */
    public void testFizzBuzz() {
        Integer[] number = Range.get(1,100);
        Approvals.verifyAll("", number, n -> n + " -> " + FizzBuzz(n));
    }

    private String FizzBuzz(int number) {
        return "" + number;
    }
}
