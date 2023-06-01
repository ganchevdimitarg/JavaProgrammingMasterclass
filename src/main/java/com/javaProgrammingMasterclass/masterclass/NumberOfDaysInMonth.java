package com.javaProgrammingMasterclass.masterclass;

public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 ||year % 400 == 0) {
                return true;
            }
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            if (isLeapYear(year) && month == 2) {
                return 29;
            } else if (!isLeapYear(year) && month == 2){
                return 28;
            } else {
                if(month == 4 || month == 6 || month == 9 || month == 11){
                    return 30;
                } else {
                    return 31;
                }
            }
        }
    }
}