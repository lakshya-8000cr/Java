package Java.BinarySearch;
import java.util.*;

public class Pivo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int st = 0;
        int end = n - 1;
        int mid = st + (end - st)/2;    
        // int ans = 0;

        while(st<=end){
            if(arr[mid]>=arr[0]){
                st = mid + 1;
            }

            else {
                end = mid - 1;
            }

            mid = st + (end - st)/2;
        }

        System.out.println(st);
        sc.close();
    }
}
