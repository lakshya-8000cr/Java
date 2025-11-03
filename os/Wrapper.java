package Java.os;

public class Wrapper {
    public static void main(String[] args){
        Integer obj2 = Integer.valueOf(12); // this is not autoboxing aur hum is type se bhi value assign kar sakte hai 
        Integer obj = 12; // this is called autoboxing 
        System.out.println(obj);
        System.out.println(obj2);
        int a  = obj; // this is called unboxing  ; obj to normal int me convert karna ;
        System.out.println(a);
    }
}
