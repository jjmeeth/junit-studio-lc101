package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void noBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello, World!"));
    }

    @Test
    public void consecutiveOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void consecutiveCloseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }




}
