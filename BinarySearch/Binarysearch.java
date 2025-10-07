package Java.BinarySearch;
import java.util.*;

public class Binarysearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt() ; 
        }
        
        int target = 30;

        int first = 0;

        int st = 0;
        int end = n - 1;
        int mid = st + (end - st)/2;
        while(st<end){
             if(arr[mid]==target){
                first = mid ;
                end = mid - 1;
             }

             else if(arr[mid] > target){
                end = mid - 1;
             }

             else{
                st = mid + 1;
             }

             mid = st + (end-st)/2;
        }


        System.out.println(first);
        sc.close();

        System.out.println(Last(arr ,target)) ;
    }

    static int Last(int[] arr , int target){
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int ans = 0;
        int mid = st + (end-st)/2;
        while(st<=end){
            if(arr[mid]==target){
                ans = mid ;
                st = mid + 1;
            }

            else if(arr[mid]>target){
                end = mid - 1;
            }

            else{
                st = mid + 1;
            }

            mid = st + (end-st)/2;
        }


        return ans;
    }
}
