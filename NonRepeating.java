package com.operators;
import java.util.*;
import java.io.*;
// XOR all the numbers
//Q- Find the non repeating element in the array

public class NonRepeating {
    public static void main(String[] args){
        int[] arr ={2,3,4,3,4,2,6};

        int un =0;

        for(int k : arr){
            un^=k;
        }
System.out.println(un);
    }
}
