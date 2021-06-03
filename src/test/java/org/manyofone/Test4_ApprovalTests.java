package org.manyofone;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class Test4_ApprovalTests {
    @Test
    /**
     * Convert verify to many of one
     */
    public void TestFizzBuzz() {
        int number = 1;
        var result = FizzBuzz(number);
        Approvals.verify(result);
    }

    private String FizzBuzz(int number) {
        return "" + number;
    }
}
