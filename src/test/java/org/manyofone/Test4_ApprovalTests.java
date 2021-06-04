package org.manyofone;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class Test4_ApprovalTests {
    @Test
    /**
     * Convert verify to many of one
     */
    public void testFizzBuzz() {
        Integer[] number = {1};
        var result = FizzBuzz(number[0]);
        Approvals.verifyAll("", number, n -> FizzBuzz(n));
    }

    private String FizzBuzz(int number) {
        return "" + number;
    }
}
