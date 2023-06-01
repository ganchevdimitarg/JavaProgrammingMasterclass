package com.javaProgrammingMasterclass.masterclass;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        if (number > 1) {
            int max = Integer.MIN_VALUE;

            while (number % 2 == 0) {
                max = 2;
                number /= 2;
            }

            for (int i = 3; i < Math.sqrt(number); i += 2) {
                while (number % i == 0) {
                    max = i;
                    number /= i;
                }
            }

            if (number > 2) {
                max = number;
            }
            return max;
        }
        return -1;
    }
}
