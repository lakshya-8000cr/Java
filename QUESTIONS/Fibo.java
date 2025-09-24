package Java.QUESTIONS;
import java.util.*;

public class Fibo {

    static int fibo(int n){
          if(n==0 || n==1){
             return n;
          }

          return fibo(n-1) + fibo(n-2);

    }
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
