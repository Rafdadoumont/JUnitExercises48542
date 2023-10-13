package org.example;

public class Digit {

    public Digit(){}

    public int getCountDigit(int number) {
        int count = 0;
        while (number > 0) {
            ++count;
            number /= 10;
        }
        return count;
    }

    public int getAverageDigit(int number) {
        int count = 0;
        int sum = 0;

        while (number > 0) {
            ++count;
            sum += number % 10;
            number /= 10;
        }
        return sum / count;
    }
}
