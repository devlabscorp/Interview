package com.interview.test.examples;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class PolindromeTest {

    private Polindrome polindrome;

    @Before
    public void setup() {
        polindrome = new Polindrome();
    }


    @Test
    public void testPolindrome() {
        assertTrue(polindrome.isAPolindrome("a"));
        assertFalse(polindrome.isAPolindrome("ab"));
        assertTrue(polindrome.isAPolindrome("abba"));
        assertTrue(polindrome.isAPolindrome("ababa"));
    }


}
