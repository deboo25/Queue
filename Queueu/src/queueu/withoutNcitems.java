
package queueu;
public class withoutNcitems {
    private int[] arr;
    private int rear;
    private int front;
    private int size;
    public withoutNcitems(int k){
    size=k+1;
    arr=new int [size];
    front=0;
    rear=-1;
            }
    
    public void insert(int k){
        if (rear==size-1)
            rear=-1;
        arr[++rear]=k;}
    
    public int delet(){
        int temp=arr[front++];
        if (front==size)
            front=0;  
    return temp;}
    
    public boolean IsEmpty(){
        return rear+1==front||front+size-1==rear;
    }
    
    public boolean IsFull(){
    return rear+2==front||front+size-2==rear;}
    
    public int peek(){
    return arr[front];}
    
    public int size(){
    if (rear<front)
        return size-front+rear+1;
    else
        return rear-front+1;
        
    }
    
    
}
