class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
    
}

public class MyClass {
    
    public static void print(Node head){
        
        while(head!=null){
                System.out.println(head.data);
                head=head.next;
            
            
        }
        
        
        //   System.out.println(head.data);
        //     System.out.println(head.next.data);
        //      System.out.println(head.next.next.data);
        
    }
    public static void main(String args[]) {
     Node head= new Node(5);
     Node sec= new Node(10);
 Node third= new Node(15);
    //   System.out.println(head.data);
      head.next=sec;
    //   System.out.println(sec);
      sec.next=third;
      print(head);
    }
}
