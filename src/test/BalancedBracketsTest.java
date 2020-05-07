package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets test_class;

    @Before
    public void createBalancedBrackets() {
        test_class = new BalancedBrackets();
    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyOpenBracketReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("["));
    }

    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("]"));
    }

    @Test
    public void stringWithBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[Miguel is cool]"));
    }

    @Test
    public void stringWithOpenBracketReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("[Miguel is cool"));
    }

    @Test
    public void stringWithClosingBracketReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("Miguel is cool]"));
    }

    @Test
    public void bracketsBeforeWordReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[]Miguel is cool"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsBetweenTwoWordsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("Miguel [is cool]"));
    }

    @Test
    public void bracketsPointingOppositesReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("Miguel ]is cool["));
    }

    @Test
    public void bracketsOppositesWithNoWordReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsPointsToRightTwoTimesReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("[["));
    }

}
