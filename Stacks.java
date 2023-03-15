//this is the implementation of stack using arrays

 class Stack{
    
    int arr[];
      int top;
     public  Stack(){
         arr=new int[5] ;
         top=-1;
      }
      
      public void push(int x){
          if(top==arr.length-1){
           doublesize();   
          }
          
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
          return arr[top];
      }
      public void doublesize(){
          int[] temp=arr;
          arr= new int[2*arr.length];
          for(int i=0;i<temp;i++){
              arr[i]=temp[i];
          }
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
      int x=s.pop();
      System.out.println("top element is "+x);
   
       System.out.println(s.isEmpty());
    }
}
