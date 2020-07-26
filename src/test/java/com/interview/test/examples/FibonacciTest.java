package com.interview.test.examples;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setup() {
        fibonacci = new Fibonacci();
    }


    @Test
    public void testFibonacciSeries() {
        assertEquals(listOf(1), fibonacci.get(1));
        assertEquals(Arrays.asList(1, 1), fibonacci.get(2));
        assertEquals(listOf(1, 1, 2), fibonacci.get(3));
        assertEquals(listOf(1, 1, 2, 3), fibonacci.get(4));
        assertEquals(listOf(1, 1, 2, 3, 5), fibonacci.get(5));
        assertEquals(listOf(1, 1, 2, 3, 5, 8), fibonacci.get(6));
        assertEquals(listOf(1, 1, 2, 3, 5, 8, 13), fibonacci.get(7));


    }

    private List<Integer> listOf(Integer... nums) {
        List<Integer> numbers = new ArrayList<>();
        for (Integer num : nums) {
            numbers.add(num);
        }

        return numbers;

    }


}
