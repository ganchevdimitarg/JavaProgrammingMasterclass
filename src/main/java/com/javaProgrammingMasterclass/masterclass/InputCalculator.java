package com.javaProgrammingMasterclass.masterclass;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        long sum = 0;
        long totalNumbers = 0;

        while (true) {
            try {
                long n = Long.parseLong(number);
                sum += n;
                totalNumbers++;
                number = scanner.nextLine();
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (totalNumbers == 0) {
            System.out.println("SUM = 0 AVG = 0");
        } else {
            System.out.printf("SUM = %d AVG = %d", sum, (int) Math.ceil(sum / (double) totalNumbers));
        }
    }
}
