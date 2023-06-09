package com.javaProgrammingMasterclass.masterclass;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(-1.5);
        printConversion(10.25);
        printConversion(25.42);
        printConversion(-2.3);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.printf(kilometersPerHour + " km/h = %d mi/h\n", milesPerHour);
    }
}
