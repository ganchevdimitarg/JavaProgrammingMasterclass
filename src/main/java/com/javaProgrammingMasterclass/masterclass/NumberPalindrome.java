package com.javaProgrammingMasterclass.masterclass;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        String s =new StringBuilder(String.valueOf(number)).reverse().toString();
        if (Integer.parseInt(s) == number){
            return true;
        }
        return false;
    }
}