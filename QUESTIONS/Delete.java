package Java.QUESTIONS;
import java.util.*;

public class Delete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pos = 3;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=pos; i<n-1; i++){
            arr[i] = arr[i+1];
        }

        n--;

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
