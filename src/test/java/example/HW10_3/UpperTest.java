package example.HW10_3;
import org.example.HW10_03.MakeUpperCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class UpperTest {

    MakeUpperCase u = new MakeUpperCase();

    @Test
    public void testSomething() {
        assertEquals("HELLO",u.MakeUpperCase("hello"));
    }
}
