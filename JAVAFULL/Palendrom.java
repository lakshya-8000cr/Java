package Java.JAVAFULL;
import java.util.*;
public class Palendrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int len = s.length();
        int l = 0;
        int r = len - 1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                System.out.println("False");
                break;
            }
            else{
                System.out.println("True");
            }
            l++;
            r--;
        }
        sc.close();
    }
}

// in this sc.next readsonly words;
// but sc.nextLine reads line