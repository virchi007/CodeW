package example.HW10_2;
import org.example.HW10_2.Kata;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class KataTest {
    @Test
    public void fixedTest() {
        assertTrue(Kata.feast("great blue heron","garlic nann"));
        assertTrue(Kata.feast("chickadee","chocolate cake"));
        assertFalse(Kata.feast("brown bear","bear claw"));
    }
}