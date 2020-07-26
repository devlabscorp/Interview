package com.interview.test.examples;

public class Polindrome {

    public Boolean isAPolindrome(String name) {
        String tempName = name;
        int start = 0;
        int end = tempName.length() - 1;
        //char[] charArray = tempName.toCharArray();

        while (end > start) {
            char startChar = tempName.charAt(start++);
            char endChar = tempName.charAt(end--);

            if (startChar != endChar) {
                return false;
            }
        }

        return true;
    }
}
