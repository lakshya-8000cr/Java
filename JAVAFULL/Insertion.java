package Java.JAVAFULL;
import java.util.*;

public class Insertion {
    public static void main(String[] args){
        int[] arr = {10 , 20 , 30 , 40 , 50};
        int index = 3;
        int val = 80;
        int n = 6;
        
        for(int i=n; i>index - 1; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = val;
        n++;
        
    }
}
