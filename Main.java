package Java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String aditi = sc.nextLine();
        String arav = sc.nextLine();
        
        if(aditi.contains(arav)){
           System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
