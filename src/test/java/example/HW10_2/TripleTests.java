package example.HW10_2;
import org.example.HW10_2.Triple;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TripleTests {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", Triple.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", Triple.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", Triple.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", Triple.tripleTrouble("LLh","euo","xtr"));
    }
}
