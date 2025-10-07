package Java.SORTING;
import java.util.*;

public class select2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k =3;
        int smallest = 0;
        for(int i=0; i<k; i++){
            int index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

            smallest = arr[i];
        }

        System.out.println(smallest);

        sc.close();
    }
}
