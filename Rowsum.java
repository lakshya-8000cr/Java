package Java;
import java.util.*; 

public class Rowsum {
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

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                sum += arr[i][j];
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
