package LinkedHashSet;
import java.util.*;
public class LinkedHashSet {
    public static void main(String[] args) {
        LinkedList <String> list=new LinkedList<>();
        list.add("sumit");
        list.add("Manoj");
        list.add("sunny");
        list.add("Manoj");
        list.add("arjun");
        list.add(null);
        for (String obj:list){
            System.out.println(obj);
        }
    }
}
