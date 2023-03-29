package example.HW10_2;

import org.example.HW10_2.AbbreviateTwoWords;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AbbreviateTwoWordsTest {

    @Test
    public void testFixed() {
        Assert.assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
    }
}
