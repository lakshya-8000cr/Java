package Java.SORTING;
import java.util.*;

public class select1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<1; i++){
            int index = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] > arr[index]){
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp ;
        }

        for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");        
        }

        sc.close();
    }
}
