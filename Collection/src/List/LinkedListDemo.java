package List;
import  java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList i=new LinkedList();
        i.add("durga");
        i.add(22);
        i.add(null);
        i.set(0,"software");
        i.set(0,"venky");
        i.removeLast();
        i.addFirst("ccc");
        System.out.println(i);    // [ccc, venky, 22]
    }
}
