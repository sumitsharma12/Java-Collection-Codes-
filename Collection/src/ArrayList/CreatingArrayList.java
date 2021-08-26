package ArrayList;

import java.util.ArrayList;

public class CreatingArrayList {
    public void first(){
        //        Generic list Syntax :
//    Arraylist <DataType> obj_name=new Arraylist <DataType>();

        ArrayList<Integer> newlist=new ArrayList<Integer>();
        newlist.add(22);
        newlist.add(45);

//        Advance For Loop
        for(Integer list:newlist){
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        CreatingArrayList obj=new CreatingArrayList();
        obj.first();
    }
}
