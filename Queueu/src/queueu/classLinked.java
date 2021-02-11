
package queueu;
public class classLinked {
    
   public  linkedList qu;
   public classLinked(){
   qu =new linkedList();
   }
   
   public void insert(int k){
   qu.insert(k);}
   
   public int delet(){
   return qu.delet();}

   public boolean IsEmpty(){
   return qu.IsEmpty();}
   
   public void display(){
   qu.dispaly();}
   
   
}
