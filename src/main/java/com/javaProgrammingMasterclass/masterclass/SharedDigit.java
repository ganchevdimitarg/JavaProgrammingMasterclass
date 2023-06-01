package com.javaProgrammingMasterclass.masterclass;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(55, 65));
        System.out.println(hasSharedDigit(55, 66));
    }

    public static boolean hasSharedDigit(int first, int second) {
        if ((10 <= first && first <= 99) && (10 <= second && second <= 99)) {
            String[] digitsFirst = String.valueOf(first).split("");
            String[] digitSecond = String.valueOf(second).split("");
            for (String sF : digitsFirst) {
                for (String sS : digitSecond) {
                    if (sF.equals(sS)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
