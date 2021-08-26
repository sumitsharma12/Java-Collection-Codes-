package HashMap;

import java.util.HashMap;

public class CreatingHashMap {
    public void first(){
        //        Syntax for HASHMAP :
//        HashMap <Key_DataType,Value_DataType>obj_name=new HashMap <Key_DataType,Value_DataType>();
        HashMap <Integer,String> list=new HashMap<Integer,String>();


//        Put
//        Adding VALUE TO HashMap------


        list.put(1,"sumit");
        list.put(2,"manoj");
        list.put(3,"zafar");
        list.put(4,"aman");

//        list.get(1);

        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(2));
    }

    public static void main(String[] args) {
        CreatingHashMap obj=new CreatingHashMap();
        obj.first();
    }
}
