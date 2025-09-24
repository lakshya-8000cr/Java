package Java.JAVAFULL;
import java.util.*;

public class Revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        int original = n ;
        while(n!=0){
            int rem = n % 10;
            reverse = reverse*10 + rem;
            n = n / 10;
        }

        if(original==reverse){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

        sc.close();
    }
}
