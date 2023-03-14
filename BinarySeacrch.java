import java.util.Arrays;
public class MyClass {
    public static int Binary(int arr[], int left, int right, int item){
        if(right>=left){
            int mid= left+(right-left)/2;
            if(arr[mid]==item){
                return mid;
            }
            if(arr[mid]>item){
                return Binary(arr,left,mid-1,item);
            }
            else{
                return Binary(arr,mid+1,right,item);
            }
            
        }else{
            return -1;
        }
        
    }
    
    
    public static void main(String args[]) {
    int arr[]={23,56,28,55,67,99,44};
   
    Arrays.sort(arr);
   
    int item=67;
    int result=Binary(arr,0,arr.length-1,item);
    if(result==-1){
        System.out.println("Not Found");
    }
    else{
        System.out.println("Found");
    }
    }
}
