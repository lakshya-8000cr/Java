package Java.MULTIDIMESIONAL;
import java.util.*;

public class SpiralMatrix {
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

           int left = 0;
           int top = 0;
           int right = col-1;
           int bottom = row-1;

        while(left<=right && top<=bottom){

           for(int i=left; i<=right; i++){
               System.out.print(arr[top][i] + " ");
           }
           top++;

           for(int i=top; i<=bottom; i++){
               System.out.print(arr[i][right] + " ");
           }
           right--;

           if(top<=bottom){
           for(int i=right; i>=left; i--){
               System.out.print(arr[bottom][i] + " ");
           }
           bottom--;
        }
          if(left<=right){
           for(int i=bottom; i>=top; i--){
               System.out.print(arr[i][left] + " ");
           }
           left++;
        }
           
        }
    }
}
