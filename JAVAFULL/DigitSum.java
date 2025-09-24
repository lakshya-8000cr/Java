package Java.JAVAFULL;
import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }

        System.out.println("Sum of: " + n + " is : " + sum);
        sc.close();
    }
}
