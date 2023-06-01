package com.javaProgrammingMasterclass.masterclass;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        for (int i = 1; i <= bigCount; i++) {
            if (goal >= 5) {
                goal -= 5;
            }
        }
        for (int k = 1; k <= smallCount; k++) {
            if (goal >= 1) {
                goal -= 1;
            }
        }
        return goal == 0;
    }
}
