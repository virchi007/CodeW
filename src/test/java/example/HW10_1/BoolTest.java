package example.HW10_1;

import org.example.HW10_1.YesOrNo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoolTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}
