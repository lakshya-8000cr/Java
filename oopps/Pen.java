package Java.oopps;
import java.util.*;

class pencil {

    String type;
    String color;

    pencil(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void Write() {
        System.out.println("You have called object pencil");
        System.out.println("Color is : " + color);
        System.out.println("Type is : " + type);
    }

}

public class Pen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color = sc.nextLine();
        String type = sc.nextLine();

        pencil p1 = new pencil(type, color);
        p1.Write();
        pencil p2 = new pencil(color , type);
        p2.Write();

        sc.close();
    }
}

// you have noticed that we havent used the static word in the public void Write() ;
// Kabhi socha hai kyu nahi likha ?
// it is because kyuki jo color and type hai wo object se belong karte hai directly not to the class but jo main me static likhte hai toh uske matlab hai ki wo object ni hai 
