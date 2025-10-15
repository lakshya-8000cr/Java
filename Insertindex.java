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


public class Insertindex {

    public static Node insertatindex(Node head){
        int count = 0;
        Node temp = head;
        int k = 5;
        Node x = new Node(199);

        if(head==null){
            return x;
        }

        if(k==1){
            x.next = head;
            return x;

        }
        
        if(head.next==null){
            head.next = x;
            return head;
        }

        while(temp!=null){
            count++;
            if(count == k -1){
              break;
            }

            temp = temp.next;
        }
 
        x.next = temp.next;
        temp.next = x;

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
         int[] arr = {10 , 20 , 30 , 40 , 50 , 70};
         Node head = Convert(arr);
         print(head);
         System.out.println();
         print(head);

         System.out.println();

         head = insertatindex(head);
         print(head);
    }


}
