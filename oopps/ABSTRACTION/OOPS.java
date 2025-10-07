package Java.oopps.ABSTRACTION;

abstract class Animal {
    abstract void walk(); // we have make this class abstract because animal ki asal me koi jarurat ni wo toh only ek blue orint hai just main object to horse and animal ke jo bhi child hoge unka banega na so we ahve maked that abstract class
}
// agar hum animal ka object banane ki try karege toh error dega becasue animal toh abstract class hai 
class Horse extends Animal {
    public void walk(){
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Chicken is running");
    }
}

public class OOPS {
        public static void main(String[] args){
            Horse h1 = new Horse();
            Chicken c1 = new Chicken();

            h1.walk();
            c1.walk();
        }
}
