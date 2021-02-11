package queueu;
public class PritryQueue {
    private int[]arr;
    private int size;
    private int n;
    public PritryQueue(int k){
    size=k;
    arr=new int [size];
    n=0;}
    
    public void insert(int k){
        int i;
        if (n==0)
            arr[n++]=k;
        else{
            
            for (i=n-1;i>=0;i--){
                if (k>arr[i])
                    arr[i+1]=arr[i];
                else
                    break; }
            arr[i+1]=k;
        n++;
        }}
    
     public int peek(){
    return arr[n-1];}
    public boolean IsEmpty(){
    return n==0;}
    public boolean IsFull(){
    return n==size;}
    public int size(){
    return n;}
    
    public int delet(){
    return arr[--n];}
    
}
