package Java.QUESTIONS;
import java.util.*;
public class Insertion {
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int[] arr = new int[n+1];
           for(int i=0; i<n; i++){
               arr[i] = sc.nextInt();
           }

           int pos = 3;
           int val = 40;
           for(int i = n; i>=pos; i--){
               arr[i] = arr[i-1];
           }
           arr[pos] = val;
           n++;

           for(int i=0; i<n; i++){
            System.out.println(arr[i]);
           }
           sc.close();
    }
}
