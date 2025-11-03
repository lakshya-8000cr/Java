package Java;

class Car {
    Car() { this(100); System.out.println("Default"); }
    Car(int speed) { System.out.println("Speed: " + speed); }

    void sound(){
        System.out.println("Machine barks");
    }
}


class audi extends Car{
    @Override
    void sound(){
        System.out.println("Audi barks");
    }
}


public class ques3 {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car(200);
        audi a1 =  new audi();
        a1.sound();

    } // static method belong to class can be used wihout makeing object 
}
