package Java.SORTING;
import java.util.*;

public class selectionsort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        for(int i=0; i<n; i++){
            int smalindex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[smalindex]){
                    smalindex = j;
                }
            }

            int temp = arr[i] ;
            arr[i] = arr[smalindex];
            arr[smalindex] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
