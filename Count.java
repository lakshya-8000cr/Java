package Java;

class Car {
    static int count = 0;
    String name ;
    int price;
    Car(String names , int pr ){
        name = names;
        price = pr;
        count++;
        System.out.println("Deault constructor called : " + count);
        System.out.println(name + " " + price);
    }
}

public class Count {
    public static void main(String[] args){
      String name = "bmw";
      int price = 190;
      Car c1 = new Car(name , price);
      
    }
}
