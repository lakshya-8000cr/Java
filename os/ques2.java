package Java.os;
import java.util.*;

class Student {
    int roll;
    String name ;
    int grade;

    Student(int rollno , String names , int marks){
        roll = rollno;
        name = names;
        grade = marks;

        System.out.println("First Constructor called : " + roll +" " + name + " " + grade);
    }

    Student(int rollno , String names){
        roll = rollno;
        name = names;

        System.out.println("Second constructor called : " + roll + " " + name);
    }


    public void show(int rollno ,String names , int marks){
        System.out.println("Function called : " + rollno + " " + names + " " + marks);
    }


}

public class ques2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
                int roll = sc.nextInt();
                int marks = sc.nextInt();
                sc.nextLine();
                                String name = sc.nextLine();

             Student S1 = new Student(roll , name , marks);
             Student S2 = new Student(roll , name);
    }
}
