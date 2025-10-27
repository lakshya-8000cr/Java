package Java.MULTIDIMESIONAL;
import java.util.*;

import java.util.Scanner;

public class Findmax {
      public static void main( String[] args){
                   int row = 4;
           int col = 4;
           Scanner sc = new Scanner(System.in);
           int[][] arr = new int[row][col];
        //    int tar = 20;
           for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
           }


           int max = 0;
           for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
           }

           System.out.println(max);

      }   
}
