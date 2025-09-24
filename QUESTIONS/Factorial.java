package Java.QUESTIONS;
import java.util.*;

public class Factorial {
    public static void main(String[] arr){
           int fact = 1;
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
            while(n!=0){
            int rem = n % 10;
            fact*= rem;
            n = n / 10;
           }

           System.out.println(fact);
           sc.close();
    }
}
