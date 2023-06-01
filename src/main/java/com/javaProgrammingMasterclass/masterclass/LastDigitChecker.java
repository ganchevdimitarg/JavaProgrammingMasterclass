package com.javaProgrammingMasterclass.masterclass;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22, 23, 34));
        System.out.println(hasSameLastDigit(11, 43, 67));
        System.out.println(hasSameLastDigit(199, 66, 99));
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (isValid(first) && isValid(second) && isValid(third)) {
            String[] sFirst = String.valueOf(first).split("");
            String[] sSecond = String.valueOf(second).split("");
            String[] sThird = String.valueOf(third).split("");
            return sFirst[sFirst.length - 1].equals(sSecond[sSecond.length - 1]) ||
                   sFirst[sFirst.length - 1].equals(sThird[sThird.length - 1]) ||
                   sSecond[sSecond.length - 1].equals(sThird[sThird.length - 1]);
        }
        return false;
    }


    public static boolean isValid(int number) {
        return 10 <= number && number <= 1000;
    }

}
