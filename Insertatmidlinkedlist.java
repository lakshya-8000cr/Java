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

public class Insertatmidlinkedlist {

    public static Node insertatmid(Node head){

        Node x = new Node(33);

        if(head==null || head.next==null){
            return x;
        }

        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        x.next = slow.next;
        slow.next = x;

        return head;
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
         head = insertatmid(head);
         print(head);

    }
}
