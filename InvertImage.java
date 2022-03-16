package com.operators;
import java.util.*;
public class InvertImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        print(image);
      for(int[] k : image)
        System.out.println(Arrays.toString(k));






    }
      static int[][] print(int[][] image){
          for (int i = 0; i < image.length; i++) {
              int n = image[i].length;
              for (int j = 0; j < n / 2; j++) {
                  int temp = image[i][j]^1;
                  image[i][j] = image[i][n - 1];
                  image[i][n - 1] = temp;
              }

          }






          return image;
        }

}
