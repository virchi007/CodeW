package example.HW10_3;
import org.example.HW10_03.RepeatStr;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RepeatStrTest {
    @Test public void test4a() {
        assertEquals("aaaa", RepeatStr.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", RepeatStr.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", RepeatStr.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", RepeatStr.repeatStr(0, "kata"));
    }
}
