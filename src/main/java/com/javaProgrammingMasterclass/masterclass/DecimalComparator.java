package com.javaProgrammingMasterclass.masterclass;

public class DecimalComparator {
    public static void main(String[] args) {
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(areEqualByThreeDecimalPlaces(4.0,5.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        String[] fA = String.valueOf(a).split("\\.")[1].split("");
        String[] sB = String.valueOf(b).split("\\.")[1].split("");
        if ((a < 0 && b > 0) || (a > 0 && b < 0) || (!String.valueOf(a).split("\\.")[0].equals(String.valueOf(b).split("\\.")[0]))) {
            return false;
        }

        if (fA.length < sB.length) {
            for (int i = 0; i < fA.length; i++) {
                if (i < 3) {
                    if (!fA[i].equals(sB[i])) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 0; i < sB.length; i++) {
                if (i < 3) {
                    if (!fA[i].equals(sB[i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
