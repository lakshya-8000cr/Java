package Java.SORTING;
import java.util.*;

public class sortonstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String sen = sc.nextLine();
        int len = sen.length();

        char[] arr = sen.toCharArray();

        for(int i=0; i<len-1; i++){
            int index = i;
            for(int j=i+1; j<len; j++){
                if(arr[j]<arr[index]){
                    index = j;
                } 
            }

            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        String sorted = new String(arr);
        System.out.println(sorted);
        sc.close();
    }
}
