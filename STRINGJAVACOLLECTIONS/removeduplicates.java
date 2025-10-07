package Java.STRINGJAVACOLLECTIONS;
import java.util.*;

public class removeduplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // int found = 0;
        
        int n = str.length();

                String rev = "";
                for(int i=0; i<n; i++){
                    char ch = str.charAt(i);
                    if(rev.indexOf(ch)==-1){
                        rev += str.charAt(i);
                    }
                }
        System.out.println(rev);
    }
}
