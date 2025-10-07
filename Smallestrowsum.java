package Java;

import java.util.Scanner;

public class Smallestrowsum {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 3;

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int small = 10000000;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                sum += arr[i][j];
            }

            System.out.println(sum);

            if(sum<small){
                small = sum;
            }
        }

           System.out.println("Smallest is : " + small);

        sc.close();
    }
}

