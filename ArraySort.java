package Java;
import java.util.*;

public class ArraySort {
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        int Count = 0;
        for(int i=0; i<n; i++){
            if(list.get(i)==4){
                Count++;
            }
        }

        System.out.println(Count);
        sc.close();
    }
}

// we have so many fucntions o list 
// list.add(10) this will add 10 to list ;
// list.get(i) will iterate the element;
// list.remove(1) remove elements at index 1 ;