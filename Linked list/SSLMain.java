class Node{
        int data;
        Node next;
        //next is default null
        public Node(int d){
            this.data = d;
            
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = null;
        }
} 
//Linked List

class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList(){
        this.size = 0;
    }
       


    //method area
    public void insertFirst(int data){
        
        if(head == null){
            //create a new node
            Node newNode = new Node(data);
            //point head to new node
            head = newNode;
            tail = head;
        }
        else{
            //create a new node
            Node newNode = new Node(data);
            //point new node's next to head
            newNode.next = head;
            //point head to new node
            head = newNode;
        }
        size = size+1;
        

        
    }

    public void display(){
        //if list is empty
        if(head == null){
            System.out.println("List is empty");
            return;  
        }

        //if list is not empty
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        
        System.out.println("end");
        
    }

}





//main
public class SSLMain {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertFirst(5);
        l.insertFirst(6);
        l.insertFirst(7);
        l.display();
    }
}