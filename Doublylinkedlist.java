package Java;

class Node {

    int data;
    Node next;
    Node prev;

    Node(int Data ,Node Next , Node Prev){
        data = Data;
        next = Next;
        prev = Prev;
    }

    Node(int Data){
        data = Data;
        prev = null;
        next = null;
    }

    //
    
}

public class Doublylinkedlist {
      public static Node convert(int[] arr){
        Node head = new Node(arr[0] , null , null);
        Node prev = head;
        // Node temp = head;
        int n = arr.length;
        for(int i=1; i<n; i++){
            Node x = new Node(arr[i] , null , prev);
            prev.next = x;
            prev = x ;
        }

        return head;
      }

      public static void Print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
      }

     public static Node insertathead(Node head , int val){
         Node newhead = new Node(val , head , null);
         head.prev = newhead;
         return newhead;
     }

    public static void main(String[] args){
        int[] arr = {10 , 20 , 30 , 40 , 50 };
        Node head = convert(arr);
        Print(head);
    }
}
