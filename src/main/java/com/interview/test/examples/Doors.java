package com.interview.test.examples;

public class Doors {
    public boolean isOpen(int doorNumber) {
        boolean[] doors = new boolean[100];

        for (int student = 1; student <= doors.length; student++) {
            shuffle(doors, student);
        }

        return doors[doorNumber - 1];
    }

    private void shuffle(boolean[] doors, int student) {
        int increment = student;

        for (int i = increment; i <= doors.length; i += increment ) {
            doors[i - 1] = !doors[i-1];
        }

    }
}
