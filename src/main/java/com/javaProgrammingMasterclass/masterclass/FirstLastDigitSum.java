package com.javaProgrammingMasterclass.masterclass;

public class FirstLastDigitSum {
    // write your code here
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(505));
    }
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;

        String s = String.valueOf(number);
        int first = Integer.parseInt(s.charAt(0) + "");
        int last = Integer.parseInt(s.charAt(s.length() - 1) + "");
        return number < 0 ? -1 : first + last;
    }
}
