package Java.MULTIDIMESIONAL;
import java.util.*;

public class Boundaryelement {
            public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 4; // row
        int m = 4; //col
        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }   
        }

        // for the top row ;
        for(int i=0; i<n; i++){
            System.out.print(arr[0][i]+" ");
        }

        // for the right row 
        for(int i=1; i<n; i++){
            System.out.print(arr[i][m-1] + " ");
        }

        // for the bottom row;
        for(int i=m-2; i>=0; i--){
            System.out.print(arr[n-1][i] + " ");
        }

        // for the left row 
        for(int i=n-2; i>0; i--){
            System.out.print(arr[i][0] + " ");
        }

    }
}
