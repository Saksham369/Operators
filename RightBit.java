package com.operators;
import java.util.*;
import java.io.*;

//Q- Find the position of the right most set bit
//steps
// take compliment of a number
// add 1 to it
public class RightBit {
    public static void main(String[] args){
     int n = 4;
     int s = ~n;
      int d = s+1;
      int i = n&d;
int count =0;
     while(i>0){

        i=i/2;
        count++;
     }

     System.out.println(count);
    }
}
