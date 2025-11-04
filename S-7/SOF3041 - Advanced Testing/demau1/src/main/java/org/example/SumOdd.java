package org.example;

public class SumOdd {
    public int sumOdd() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 != 0) {;
                sum += i;
            }
        }
        return sum;
    }
}
