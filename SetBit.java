package com.operators;

public class SetBit {
    public static void main(String[] args) {
        // number of 1s present in the binary representation of the number 
        int n = 44;
        int count =0;
        System.out.println(Integer.toBinaryString(n));// gives the binary representation of the number
       while(n>0){

           if((n&1) ==1)
               count++;

           n=n>>1;
       }
       System.out.println(count);
    }
}
