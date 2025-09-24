package Java.QUESTIONS;
import java.util.*;

public class Pattern123 {
    public static void main(String[] arr){
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
          for(int i=1; i<=n; i++){
            int l = 1;
            for(int j=1; j<=i; j++){
                System.out.print(l);
                l++;
            }
            System.out.println();
          }
    }
}
