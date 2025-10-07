package Java.oopps;
import java.util.*;


class Student {
      String name ;
      int age ;
      int marks;

      Student(String name , int age , int marks){
        System.out.println("Student Constructor called");
        this.age = age;
        this.name = name;
        this.marks = marks;
      }

    public void print(){
        System.out.println("name is : " + name);
        System.out.println("age is : " + age);
        System.out.println("marks is : " + marks);
    }

}


public class oop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        int marks = sc.nextInt();
        Student s1 = new Student(name , age , marks);
        s1.print();
    }
    
}
