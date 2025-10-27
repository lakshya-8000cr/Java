package Java.MULTIDIMESIONAL;

import java.util.Scanner;

public class Columnsun {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 4;
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += arr[i][j];
            }

            System.out.println("Column " + (i+1) + " Sum : " + sum);
        }
    }
}
