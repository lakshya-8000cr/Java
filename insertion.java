package Java;
import java.util.*;

public class insertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ele = sc.nextInt();
        int pos = sc.nextInt();
        if(pos<0 || pos > n){
            System.out.println("Invalid position");
        }
        else{
            for(int i=n; i>pos; i--){
                arr[i] = arr[i-1];
            }

            arr[pos] = ele;
            n++;

            for(int i=0; i<n; i++){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
