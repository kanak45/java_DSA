package Functions1.DataDtructure;

public class linkedlist {
    public static void displayRecurr(Node head){
        if(head == null) return;
        System.out.print(head.data + " "); //printing the data of the current node
        displayRecurr(head.next); //recursive call to display the next node
    }
    public static void display(Node haed){ //function to display the linked list
        Node temp = haed; //temp is a pointer to the first node (displaying the linked list)
        while(temp != null){
            System.out.print(temp.data + " "); //printing the data of each node
            temp = temp.next; //moving to the next node
        }
    }
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data){ //constructor
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(7);
        Node f = new Node(8);

        a.next = b; //connecting nodes a-> b
       // System.out.println(a.data);
        b.next = c; //connecting nodes b-> c    
        //System.out.println(a.next.data);
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
         
       // Node temp =a; //temp is a pointer to the first node (displaying the linked list)
        // for(int i=1; i<=6; i++){
        //     System.out.print(temp.data+ " "); //printing the data of each node
        //     temp = temp.next; //moving to the next node
        // }

        // while(temp!=null){
        //     System.out.print (temp.data + " "); //printing the data of each node
        //     temp = temp.next; //moving to the next node
        // }
        display(a);
        System.out.println();
        displayRecurr(a); //calling the display function to print the linked list
    }
}
