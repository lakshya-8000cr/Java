package Java.QUESTIONS;
import java.util.*;

public class Inverted {
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
