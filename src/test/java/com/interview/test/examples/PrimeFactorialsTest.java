package com.interview.test.examples;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class PrimeFactorialsTest {

    private PrimeFactorials primeFactorials;

    @Before
    public void setup() {
        primeFactorials = new PrimeFactorials();
    }

    @Test
    public void testFactorials() {
        assertEquals(Collections.emptyList(), primeFactorials.listFactors(1));
        assertEquals(Arrays.asList(2), primeFactorials.listFactors(2));

        //assertEquals(listOf(2), primeFactorials.listFactors(2));
        assertEquals(listOf(3), primeFactorials.listFactors(3));
        assertEquals(listOf(2, 2), primeFactorials.listFactors(4));
        assertEquals(listOf(5), primeFactorials.listFactors(5));
        assertEquals(listOf(2, 3), primeFactorials.listFactors(6));
        assertEquals(listOf(7), primeFactorials.listFactors(7));
        assertEquals(listOf(2, 2, 2), primeFactorials.listFactors(8));
        assertEquals(listOf(3, 3), primeFactorials.listFactors(9));
        assertEquals(listOf(2, 5), primeFactorials.listFactors(10));
        assertEquals(listOf(11), primeFactorials.listFactors(11));
        assertEquals(listOf(2, 2, 3), primeFactorials.listFactors(12));
        assertEquals(listOf(2, 2, 3, 5, 7, 11, 13), primeFactorials.listFactors(2*2*3*5*7*11*13));

    }

    private List<Integer> listOf(Integer... nums) {
        List<Integer> numbers = new ArrayList<>();
        for (Integer num : nums) {
            numbers.add(num);
        }

        return numbers;

    }


}
