package Java.STRINGJAVACOLLECTIONS;
import java.util.*;

public class palendrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = 0;
        int n = str.length();
        int j = n - 1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("False");
                break;
            }
            else{
                System.out.println("true");
                break;
            }
        }

        sc.close();
    }
}
