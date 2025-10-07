package Java.STRINGJAVACOLLECTIONS;
import java.util.*;

public class vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vo = 0;
        int co = 0;
        int n = str.length();

        char[] arr = str.toCharArray();
        for(int i=0; i<n; i++){
            char ch = arr[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vo++;
            }
            else{
                co++;
            }
            
        }

        System.out.println(vo);
        System.out.println(co);

        sc.close();

    }
}
