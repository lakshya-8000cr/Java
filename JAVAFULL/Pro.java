package Java.JAVAFULL;
import java.util.*;

public class Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pro = 1;
        for(int i=0; i<n; i++){
            int rem = n % 10;
            pro *= rem;
            n = n / 10;
        }
        System.out.println(pro);
        sc.close();
    }
}
