package Java.oopps.Polymorphism;

class Student{ 
    String name ;
    int age ;

    Student(String name , int age){
        this.name = name ;
        this.age = age;
    }

    public void print(String name){
        System.out.println("Name: " + name);
    }
 
    public void print(String name , int age){
        System.out.println("Name: " + name + " " + age) ; // thats how we do fucntion overloading smae name diff works // this is compile time polymorphism
    }

}

public class OOPS {
    public static void main(String[] args){
        String name = "Lakshya ";
        int age = 20;
        Student s1 = new Student("Lakshya", 20);
        s1.print(name);
        s1.print(name , age) ;
    }
}
