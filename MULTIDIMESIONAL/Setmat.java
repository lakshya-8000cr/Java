package Java.MULTIDIMESIONAL;
import java.util.*;
// import java.util.Set;
import java.util.HashSet;

public class Setmat {
    public static void main(String[] args){
           int row = 3;
           int col = 4;
           Scanner sc = new Scanner(System.in);
           int[][] arr = new int[row][col];
        //    int tar = 20;
           for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
           }

        Set<Integer> rowcol = new HashSet<>();
        Set<Integer> colscol = new HashSet<>();

           int n = 0;
           int m = 0;
           for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==0){
                    rowcol.add(i);
                    colscol.add(j);
                }
            }
           }
 
           for(int i : rowcol ){
           for(int j=0; j<col; j++){
               arr[i][j] =  0;
           }
        }
           for(int i : colscol){
           for(int j=0; j<row; j++){
               arr[j][i] = 0;
           }
        }


           for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
           }

           sc.close();

    }
}
