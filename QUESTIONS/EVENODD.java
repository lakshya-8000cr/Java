package Java.QUESTIONS;
import java.util.*;

public class EVENODD {
    public static void main(String[] arr){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int counteve = 0;
           int countodd = 0;
           while(n!=0){
            int rem = n % 10;
            if(rem % 2 == 0){
                counteve++;
            }
            else{
                countodd++;
            }

            n = n / 10;
           }
           System.out.println(countodd);
           System.out.println(counteve);
        sc.close();
    }
}
