package com.operators;

public class MagicNumber {
    //Q- Find the nth magic number

    public static void main(String[] args){
        int n = 5;
        int sum =0;
                int i= 1;
        while(n > 0){
            int r = n&1;
            sum += (r * (int) (Math.pow(5, i)));
            i++;
                    n = n>>1;

        }
        System.out.println(sum);
    }
}
