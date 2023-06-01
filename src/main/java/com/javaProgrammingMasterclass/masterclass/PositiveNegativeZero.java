package com.javaProgrammingMasterclass.masterclass;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(50);
    }

    public static void checkNumber(int number) {
        if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }
    }
}
