package Java.oopps;
import java.util.*;

class Java {
    int len ;
    int bre ;

    Java(){
      len = 1;
      bre = 1; 
    }

    Java(int length ,  int bredth){
        len = length;
        bre = bredth;
    }

    public int area(){
        int area = len * bre;
        return area;
    }
}

public class ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        Java obj1 = new Java();
        Java obj2 = new Java(len , bre);
        System.out.println("Parameter constructir area is : " + obj2.area());
        System.out.println("Default constructor area is : " + obj1.area());
        sc.close();
    }
}
