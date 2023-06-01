package com.javaProgrammingMasterclass.masterclass;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    /*public static int getEvenDigitSum(int number) {
        return number < 0 ? -1 : Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).filter(i -> i % 2 == 0).sum();
    }*/

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        String[] digits = String.valueOf(number).split("");
        for (String digit : digits) {
            if (Integer.parseInt(digit) % 2 == 0) {
                sum += Integer.parseInt(digit);
            }
        }
        return sum;
    }
}

