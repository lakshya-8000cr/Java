package Java.JAVAFULL;
import java.util.*;;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int m = sc.nextInt();
        System.out.print("Enter the number2 : ");
        int n = sc.nextInt();
        int sum = m + n;
        System.out.println("sum: " + sum);
        sc.close();
    }
}
