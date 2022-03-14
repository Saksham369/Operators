package com.operators;


import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args){
        Scanner ss =new Scanner(System.in);
        int n = ss.nextInt();
        if((n&1) == 1)//Using AND operator 
        {
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
