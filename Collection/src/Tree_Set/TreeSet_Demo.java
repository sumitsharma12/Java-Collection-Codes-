package Tree_Set;
import java.util.*;
public class TreeSet_Demo {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");
//        t.add(22);  //ClassCastException
//        t.add(null);   //NullPointerException
        System.out.println(t);
    }

}
