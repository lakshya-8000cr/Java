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

public class revision {

    public static Node deletehead(Node head){ // this is for deletion of head .
        Node temp = head;
        Node newhead = head.next;
        return newhead;
    }

    public static Node deletetail(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    public static Node deleteatindex(Node head){
        Node temp = head;
        int k = 1;
        int count = 0;
        while(temp!=null && count<k-1){
            count++;
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static Node deletefromendkth(Node head ){

        Node temp = head;

        int count = 1;
        int k = 3;

        while(temp!=null){
            count++;
            temp = temp.next;
        }

        temp = head;
        int cnt = 1;
        while(temp!=null){
            cnt++;
            if(count-k==cnt){
               break;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static Node insertathead(Node head , int val){
        Node newhead = new Node(val);
        newhead.next = head;
        return newhead;
    }

    public static Node insertattail(Node head , int val){

        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        Node newnode = new Node(val);
        temp.next = newnode;
        return head;
    }

    public static Node inseratindex(Node head , int val){
        int k = 2;
        int count = 0;
        Node temp = head;
        Node newnode = new Node(val);
        while(temp!=null && count<k-1){
            count++;
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;
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

        System.out.println();
    }
    public static void main(String[] args){
         int[] arr = {10 , 20 , 30 , 40 , 50};
         Node head = Convert(arr);
         head = deletehead(head);
         print(head);
         head = deletetail(head);
         print(head);
         head = deleteatindex(head);
         print(head);
         head = insertathead(head , 90);
         print(head);
         head = insertattail(head , 100);
         print(head);
         head = inseratindex(head , 120);
         print(head);
         head = deletefromendkth(head);
         print(head);
    }

}
