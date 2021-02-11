
package queueu;
public class linkedList {
    
    private link first;
    private link last;
    
    public linkedList(){
    first=null;
    last=null;
    }
    public void insert(int k){
     link cur=new link(k);
     if (IsEmpty())
         first=cur;
     else
         last.next=cur;
     last=cur;}
    
    
    public int delet(){
    if (IsEmpty())
        return 0;
    else{
        link temp=first;
        if(first.next==null)
            last=null;
        first=first.next;
    return temp.id;}
    }
    
    public boolean IsEmpty(){
    return first==null;}
    
    public void dispaly(){
    link current=first;
    while(current!=null){
        current.display();
        current=current.next;
    }
    System.out.println(" ");}
    
}
