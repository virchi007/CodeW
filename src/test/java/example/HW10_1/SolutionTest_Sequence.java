package example.HW10_1;

import org.example.HW10_1.Sequence;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest_Sequence {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, Sequence.reverse(5));
    }
}
