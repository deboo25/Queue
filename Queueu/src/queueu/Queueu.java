
package queueu;


public class Queueu {

 
    public static void main(String[] args) {
        int a=10;
        q k=new q(a);
        System.out.println(k.IsEmpty());
            System.out.println(k.IsFull());
         k.insert(1);
         k.insert(2);
         k.insert(3);
         k.insert(4);
         k.insert(5);
         k.insert(6);
          System.out.println(k.IsEmpty());
            System.out.println(k.IsFull());
         while(!k.IsEmpty()){
         System.out.println(k.delet());}
          System.out.println(k.IsEmpty());
            System.out.println(k.IsFull());
            
            int s=12;
            withoutNcitems w=new withoutNcitems(s);
            System.out.println(w.IsEmpty());
            w.insert(12);
            w.insert(10);
            System.out.println(w.IsEmpty());
            System.out.println(w.IsFull());
            w.insert(1);
            w.insert(2);
            w.insert(3);
            w.insert(4);
            w.insert(5);
            w.insert(6);
            w.insert(7);
            w.insert(8);
            w.insert(9);
            w.insert(11);
            System.out.println(w.IsEmpty());
            System.out.println(w.IsFull());
            
            while(!w.IsEmpty()){
            System.out.println(w.delet());}
            
            System.out.println(w.IsEmpty());
            System.out.println(w.IsFull());
            
            
            PritryQueue e=new PritryQueue(a);
            System.out.println(e.IsEmpty());
            e.insert(3);
            e.insert(10);
            e.insert(2);
            e.insert(5);
            System.out.println(e.IsEmpty());
            System.out.println(e.IsFull());
            e.insert(6);
            e.insert(1);
            e.insert(9);
            e.insert(7);
            e.insert(4);
            e.insert(8);
            System.out.println(e.IsEmpty());
            System.out.println(e.IsFull());
            while(!e.IsEmpty()){
            System.out.println(e.delet());}
            System.out.println(e.IsEmpty());
            System.out.println(e.IsFull());
            
            
            classLinked l=new classLinked();
            System.out.println(l.IsEmpty());
            l.insert(12);
            l.insert(13);
            l.insert(14);
            l.insert(17);
            l.insert(19);
            l.insert(22);
            l.insert(30);
            System.out.println(l.IsEmpty());
            l.display();
            System.out.println(l.IsEmpty());
            while(!l.IsEmpty()){
            System.out.println(l.delet());}
            System.out.println(l.IsEmpty());
            
                  
            
            
    }
    
}
