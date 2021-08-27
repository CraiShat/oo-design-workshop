import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {

    @Test
    public void isStartWithInclusiveWithBracketsShouldBeTrue () {
        Range range = new Range("[1,5]");
        boolean actualResult = range.isStartWithInclusiveWithBrackets();
        assertTrue(actualResult);
    }

    @Test
    public void isStartWithInclusiveWithParenthesesShouldBeFalse () {
        Range range = new Range("[1,5]");
        boolean actualResult = range.isStartWithInclusiveWithParentheses();
        assertFalse(actualResult);
    }

    @Test
    public void getStartInputShoulde1 () {
        Range range = new Range("[1,5]");
        int actualResult = range.getStartInput();
        assertEquals(1, actualResult);
    }

    @Test
    public void isEndWithInclusiveWithBracketsShouldBeTrue () {
        Range range = new Range("[1,5]");
        boolean actualResult = range.isEndWithInclusiveWithBrackets();
        assertTrue(actualResult);
    }

    @Test
    public void isEndWithInclusiveWithParenthesesShouldBeFalse () {
        Range range = new Range("[1,5]");
        boolean actualResult = range.isEndWithInclusiveWithParentheses();
        assertFalse(actualResult);
    }

    @Test
    public void getStartInputShoulde2 () {
        Range range = new Range("[1,5]");
        int actualResult = range.getEndInput();
        assertEquals(5, actualResult);
    }
}
