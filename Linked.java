package Java;

class Node {
    int data ;
    Node next ;

    Node(int data1 , Node Next){
        data = data1;
        next = Next;
    }

    Node(int data1){
        data = data1;
        next = null;
    }

}

public class Linked {

    public static Node Convert(int[] arr){
        Node head = new Node(arr[0]); 
        Node temp =  head;
        int n = arr.length;
        for(int i=1; i<n; i++){
            Node x = new Node(arr[i]);
            temp.next = x;
            temp = x;
        }

        return head;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
         int[] arr = {10 , 20 , 30 , 40 , 50};
         Node head = Convert(arr);
         print(head);
    }
}
