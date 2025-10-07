package Java.BinarySearch;
import java.util.*;

public class Insertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tar = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int st = 0;
        int ans = n;
        int end = n -1;
        int mid = st + (end -st)/2;
        while(st<=end){
            if(arr[mid]==tar){
                ans = mid;
                break;
            }
            else if(arr[mid]>tar){
                ans = mid;
                end = mid - 1;
            }

            else{
                st = mid +1;
            }

            mid = st + (end - st)/2;
        }

        System.out.println(ans);
        sc.close();
    }
}
