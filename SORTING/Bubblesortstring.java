package Java.SORTING;
import java.util.*;

public class Bubblesortstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<len-i-1; j++){
                if(arr[j]>arr[j+1]){

                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        String array = new String(arr);
        System.out.println(array);

        sc.close();
    }
}
