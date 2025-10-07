package Java.BinarySearch;
import java.util.*;
public class Binarysearch2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tar = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int st = 0;
        int end = arr.length;
        int mid = st + (end-st)/2;

        while(st<=end){
            if(arr[mid]==tar){
                System.out.println("True");
                break;
            }

            else if(arr[mid]>tar){
                end = mid - 1;
            }

            else{
                st = mid + 1;
            }

            mid = st + (end-st)/2;
        }

        sc.close();
    }
}
