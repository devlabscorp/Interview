package com.interview.test.examples;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StringListArrayTest {

    private StringListArray stringListArray;

    @Before
    public void setup() {
        stringListArray = new StringListArray();
    }

    @Test
    public void testAdd() {
        assertTrue(stringListArray.add("a1"));
        assertTrue(stringListArray.add("a2"));
        assertTrue(stringListArray.add("a3"));
        assertTrue(stringListArray.add("a4"));
        assertTrue(stringListArray.add("a5"));
        assertTrue(stringListArray.add("a6"));
        assertFalse(stringListArray.add("a7"));


    }

    @Test
    public void testDuplicateAdd() {
        assertTrue(stringListArray.add("a1"));
        assertFalse(stringListArray.add("a1"));
        assertTrue(stringListArray.add("a3"));
    }

    @Test
    public void testGet() {
        stringListArray.add("a1");
        stringListArray.add("a2");
        stringListArray.add("a3");

        stringListArray.add("a4");
        stringListArray.add("a5");
        assertEquals(new String[] {"a5", "a4", "a3", "a2", "a1"}, stringListArray.get());
        stringListArray.add("a6");
        assertEquals(new String[] {"a6", "a5", "a4", "a3", "a2", "a1"}, stringListArray.get());
        stringListArray.add("a7");

        assertEquals(new String[] {"a6", "a5", "a4", "a3", "a2", "a1"}, stringListArray.get());
    }
}
