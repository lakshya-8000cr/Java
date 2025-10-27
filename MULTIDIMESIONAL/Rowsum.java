package Java.MULTIDIMESIONAL;

import java.util.Scanner;

public class Rowsum {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 4;
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                sum += arr[i][j];
            }

            System.out.println("Row " + (i+1) + " Sum : " + sum);
        }
    }
}
