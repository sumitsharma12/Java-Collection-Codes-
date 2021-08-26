package HashSet;

import java.util.HashSet;

public class CreatinghHashSet {
    public void create(){
//        Hashset <DataType> obj_name=new Hashset <DataType>();
        HashSet <String> list=new HashSet<String>();
        list.add("sumit");
        list.add("Manoj");
        list.add("sunny");
        list.add("Manoj");
        list.add("arjun");
list.add(null);
        for(String object:list){
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        CreatinghHashSet obj=new CreatinghHashSet();
        obj.create();
    }
}
