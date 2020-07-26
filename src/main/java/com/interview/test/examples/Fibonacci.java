package com.interview.test.examples;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public List<Integer> get(Integer many) {
        List<Integer> numbers = new ArrayList<>();

        for (Integer i = 1; i <= many; i++) {
            numbers.add(getFibonacci(i));
        }

        return numbers;
    }

    private Integer getFibonacci(Integer number) {
        if (1 == number || 2 == number) {
            return 1;
        }

        return getFibonacci(number - 2) + getFibonacci(number - 1);
    }


}
