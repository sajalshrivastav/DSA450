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
                System.out.print(head.data+"-->");
                head=head.next;
            
            
        }
        System.out.print(head);
        
        
        //   System.out.println(head.data);
        //     System.out.println(head.next.data);
        //      System.out.println(head.next.next.data);
        
    }
    public static void length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
            
        }
        System.out.println(count);
        
    }
    public static void insert(Node head,int x,int pos){
        Node temp=head;
        Node newNode= new Node(x);
        int count=1;
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        Node nextNode=temp.next;
        temp.next=newNode;
        newNode.next=nextNode;
        
    }
    
    
    public static void main(String args[]) {
     Node head= new Node(5);
     Node sec= new Node(10);
 Node third= new Node(15);
    //   System.out.println(head.data);
      head.next=sec;
    //   System.out.println(sec);
      sec.next=third;
       System.out.println("Linkedlist before insertion");
      print(head);
      insert(head,7,3);
      System.out.println("Linkedlist before insertion");
      print(head);
      System.out.println();
      length(head);
    }
}
