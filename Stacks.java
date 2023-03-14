//this is the implementation of stack using arrays

 class Stack{
    
    int arr[];
      int top;
     public  Stack(){
         arr=new int[5] ;
         top=-1;
      }
      
      public void push(int x){
        //   if(top==arr.length-1){
              
        //   }
          
          top++;
          arr[top]=x;
          
      }
      public int pop(){
          int removedelement=arr[top];
          top--;
          return removedelement;
          
      }
      public boolean isEmpty(){
          if(top==-1){
              return true;
          }
          return false;
          
      }
      public int size(){
          return top+1;
      }
      
      public int top(){
          return top;
      }
}

public class MyClass {
    public static void main(String args[]) {
      Stack s= new Stack();
      s.push(5);
      s.push(15);
      s.push(25);
    //   s.push(35);
    
      System.out.println(s.size());
      System.out.println(s.top());
    }
}
