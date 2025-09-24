package Java.JAVAFULL;
import java.util.*;

public class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int Lar = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>Lar){
                Lar = arr[i];
            }
        }

        System.out.println(Lar);
        sc.close();
    }
}

// array ka input aise lete hai arr[i] = sc.nextInt();
