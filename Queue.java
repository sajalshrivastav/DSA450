

class QueueFullException extends Exception {
    
}
class QueueEmptyException extends Exception {
    
}

class Queue{
    private int[] arr;
   private int front;
    private int rear;
    private int size;
    
    public Queue(){
        arr=new int[5];
        front=-1;
        rear=-1;
        size=0;
        
    }
    //returning the size
   public int size(){
       return size;
   } 
   public boolean isEmpty(){
       if(size==0){
           return true;
       }
       return false;
   }
   public int front(){
       return arr[front];
       
   }
   public void enqueue(int data) throws QueueFullException{
      if(size==arr.length){
          throw new QueueFullException();
      }
       if(size==0){
           front++;
       }
       rear++;
       arr[rear]=data;
       size++;
       
   }
   public int dequeue()throws QueueEmptyException{
       
       if(size==0){
           front=-1;
           rear=-1;
       }
       if(size==0){
           throw new QueueEmptyException();
       }
       int removeItem=arr[front];
       front++;
       size--;
       return removeItem;
   }
    
}

public class MyClass {
    public static void main(String args[]) {
     Queue q= new Queue();
// add the element this code is not full
      System.out.println();
    }
}
