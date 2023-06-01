package com.javaProgrammingMasterclass.masterclass;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 8));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay > 7 && hourOfDay < 23) || (hourOfDay < 0 || hourOfDay > 23)) {
            return false;
        }
        return barking;
    }
}
