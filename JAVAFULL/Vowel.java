package Java.JAVAFULL;
import java.util.*;

public class Vowel {
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        int vowcount = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowcount++;
            }
            else{
                count++;
            }
        }

        System.out.println(vowcount);
        System.out.println(count);
        sc.close();
    }
}
