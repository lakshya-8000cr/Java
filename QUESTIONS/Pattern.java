package Java.QUESTIONS;
import java.util.*;

public class Pattern {
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
