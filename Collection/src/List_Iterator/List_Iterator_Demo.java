package List_Iterator;
import java.util.*;
public class List_Iterator_Demo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("Ramanjan");
        l.add("Vendana");
        l.add("cheru");
        l.add("nag");
        System.out.println(l);   //[Ramanjan, Vendana, cheru, nag]
        ListIterator itr=l.listIterator();
        while (itr.hasNext())
        {
       String s=(String) itr.next();
       if (s.equals("Vendana")){
           itr.remove();
       }
       else if(s.equals("nag")){
           itr.add("chintu");
       }
       else if(s.equals("cheru")){
           itr.set("charan");
       }
        }
        System.out.println(l);  //[Ramanjan, charan, nag, chintu]
    }
}
