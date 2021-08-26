package List;
import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
s.push(22);
s.push(44);
s.push(64);
        System.out.println(s);
        System.out.println(s.search(22));  // 3
        System.out.println(s.search(87));  // -1
    }

}
