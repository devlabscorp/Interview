package com.interview.test.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactorials {
    public List<Integer> listFactors(final Integer num) {
        List<Integer> factors = new ArrayList<>();

        Integer number = num;
        Integer divisor = 2;

        while (number > 1) {
            while (0 == number % divisor) {
                factors.add(divisor);

                number = number / divisor;
            }
            divisor ++;

        }



        return factors;
    }
}
