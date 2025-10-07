package Java.SORTING;
import java.util.*;

public class sorting {

      static int partition(int[] arr , int low , int high){
        int i=low-1;
        int pivot = arr[high];

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
      }

      static void quicksort(int[] arr , int low , int high){
        if(low<high){
            int pidx = partition(arr , low , high);

            quicksort(arr , low , pidx - 1);
            quicksort(arr , pidx + 1 , high);
        }
      }
       public static void main(String[] args){
        int[] arr = {10 , 1 , 13 , 2 ,20};
        int n = arr.length;
        quicksort(arr , 0, n - 1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

       }
}
