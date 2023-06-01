package com.javaProgrammingMasterclass.masterclass;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(-56);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String[] digits = String.valueOf(number).split("");
        for (String digit : digits) {
            if ("0".equals(digit)) {
                System.out.println("Zero");
            } else if ("1".equals(digit)) {
                System.out.println("One");
            }else if ("2".equals(digit)) {
                System.out.println("Two");
            }else if ("3".equals(digit)) {
                System.out.println("Three");
            }else if ("4".equals(digit)) {
                System.out.println("Four");
            }else if ("5".equals(digit)) {
                System.out.println("Five");
            }else if ("6".equals(digit)) {
                System.out.println("Six");
            }else if ("7".equals(digit)) {
                System.out.println("Seven");
            }else if ("8".equals(digit)) {
                System.out.println("Eight");
            }else if ("9".equals(digit)) {
                System.out.println("Nine");
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }

    public static int reverse(int number) {
        return Integer.parseInt(new StringBuilder().append(String.valueOf(number)).reverse().toString());
    }
}
