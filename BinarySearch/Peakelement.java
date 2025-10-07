package Java.BinarySearch;
import java.util.*;

public class Peakelement {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
         }

         int ans = 0;
         int st = 0;
         int end = n - 1;
         int mid = st + (end - st)/2;
         while(st<=end){
            if(arr[mid]>arr[mid-1]){
                ans = arr[mid];
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }

            mid = st + (end -st)/2;
         }

         System.out.println(ans);

         sc.close();    
    }
}
