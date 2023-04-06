package example.HW10_2;
import org.example.HW10_2.PositionaOfAlphabet;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class PositionaOfAlphabetTest {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", PositionaOfAlphabet.position('a'));
        assertEquals("Position of alphabet: 26", PositionaOfAlphabet.position('z'));
        assertEquals("Position of alphabet: 5", PositionaOfAlphabet.position('e'));
    }
}
