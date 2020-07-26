package com.interview.test.examples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DoorsTest {

    private Doors doors;

    @Before
    public void setup() {

        doors = new Doors();
    }

    @Test
    public void testDoorsOpen() {

        assertTrue(doors.isOpen(1));
        assertFalse(doors.isOpen(2));
        assertTrue(doors.isOpen(4));
        assertTrue(doors.isOpen(9));
        assertFalse(doors.isOpen(10));


    }





}
