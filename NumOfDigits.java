package com.operators;

public class NumOfDigits {
    //Time Complexity O(log n)
    //Find the number of digits of a number
    public static void main(String[] args){
        int n = 4;
        int b = 2;
        int ans = (int)(Math.log(n)/Math.log(b))  + 1;
        System.out.println(ans);
    }
}
