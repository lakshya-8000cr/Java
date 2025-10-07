package Java;

class Node {
    int data ;
    Node next;

    Node(int data1 , Node Next){
        data = data1;
        next = Next;
    }

    Node(int data1){
        data = data1;
    }

}

public class Insertattaillinked {

    public static Node insertattail(Node head){

        Node temp = head;
                Node x = new Node(100);
                if(head==null){
                    return x;
                }

        while(temp.next!=null){
          temp = temp.next;
        }
 
        temp.next = x;

        return head;

    }
    public static Node insertathead(Node head){
        Node temp = new Node(90 , head);
        return temp;
    }

    
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
         System.out.println();

         head = insertathead(head);
         print(head);

         System.out.println();
         head = insertattail(head);
         print(head);
    }


}
