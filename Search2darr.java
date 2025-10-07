package Java;
import java.util.*;
public class Search2darr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int target = 10;

        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(arr[i][j]==target){
                    System.out.println("Mil gaya oye");
                }
                else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
