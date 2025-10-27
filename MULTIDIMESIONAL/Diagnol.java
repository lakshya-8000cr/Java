package Java.MULTIDIMESIONAL;

import java.util.Scanner;

public class Diagnol {
public static void main(String[] args){
               int row = 4;
           int col = 4;
           Scanner sc = new Scanner(System.in);
           int[][] arr = new int[row][col];
           int tar = 20;
           for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
           }

           for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                if(i==j){
                    System.out.print(arr[i][j] + " ");
                }
            }
           }

}    
}
