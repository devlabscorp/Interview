package com.interview.test.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<Integer, String> lines = new TreeMap<>();

        lines.put(30, "Hello");
        lines.put(20, "World 1");
        lines.put(20, "World 1 Dup");

        System.out.println(lines);

    }
}
