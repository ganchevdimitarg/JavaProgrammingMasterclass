package com.javaProgrammingMasterclass.masterclass;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(32);
    }

    public static void printFactors(int number) {
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
