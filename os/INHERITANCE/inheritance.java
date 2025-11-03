package Java.os.INHERITANCE;

class Shape{
    String name = "Kkkkkk" ;
}

class Triangle extends Shape {
     public void print(){
        System.out.println("namee is : " + name); // this is single level triangle 
     }
}

class rightangletriangle extends Triangle { // this is multilevel triangle

}

public class inheritance {
    public static void main(String[] args){
          Triangle t1 = new Triangle();
          t1.print();
    }
}
