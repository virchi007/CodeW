package example.HW10_2;
import org.example.HW10_2.ArrayPlusArray;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class arrayPlusArrayTest {
    @Test
    public void sampleTests() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));

    }
}
