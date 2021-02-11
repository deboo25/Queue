
package queueu;
public class q {
    private int[]arr;
    private int size;
    private int front;
    private int rear;
    private int n;
    public q(int k){
    size=k;
    arr=new int[size];
    n=0;
    front=0;
    rear=-1;
    }
    public void insert(int key){
        if (!IsFull()&&rear==size-1)
            rear=-1;
            
           arr[++rear]=key;
           n++;
        
    }
    public int delet(){
      
      
        int temp=arr[front++];
        if (front==size)
            front=0;
        n--;
        return temp;
        }
    public int peek(){
    return arr[front];}
    public boolean IsEmpty(){
    return n==0;}
    public boolean IsFull(){
    return n==size;}
    public int size(){
    return n;}
    
    
}
