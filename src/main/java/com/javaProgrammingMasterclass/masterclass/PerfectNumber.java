package com.javaProgrammingMasterclass.masterclass;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number >= 1 && sum == number;
    }
}
