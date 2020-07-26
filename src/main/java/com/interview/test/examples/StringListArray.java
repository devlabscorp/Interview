package com.interview.test.examples;

public class StringListArray {

    private String[] array = new String[6];


    public boolean add(String element) {
        for (int i=0; i< array.length; i++) {
            if (element.equals(array[i])) {
                return false;
            }
            if (null == array[i]) {
                array[i] = element;
                return true;
            }
        }

        return false;
    }

    public String[] get() {
        int counter = 0;
        int arraySize = array.length -1;
        int nonNullSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (null != array[i]) {
                nonNullSize = nonNullSize + 1;
            }
        }

        String[] reversedArray = new String[nonNullSize];
        while (arraySize >= 0) {
            if (null != array[arraySize]) {
                System.out.println(array[arraySize]);
                reversedArray[counter++] = array[arraySize--];
            } else {
                arraySize--;
            }
        }

        return reversedArray;
    }
}
