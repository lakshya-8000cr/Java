package Java.STRINGJAVACOLLECTIONS;
import java.util.*;

public class Reverse {
    public static void main(String[] args){
        String str = "Lakshya";
        String rev = "";
        int len = str.length();
        for(int i=len-1; i>=0; i--){
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }
}
