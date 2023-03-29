package example.HW10_1;

import org.example.HW10_1.Solution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest_Solution {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Solution.stringToArray("I love arrays they are my favorite"));
    }
}
