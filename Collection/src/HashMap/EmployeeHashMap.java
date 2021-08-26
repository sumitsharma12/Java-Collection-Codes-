package HashMap;

import java.util.HashMap;

public class EmployeeHashMap {
    public void first(){
        HashMap<Integer,Employee> list=new HashMap<Integer,Employee>();
        Employee employe1=new Employee("sumit",22);
        Employee employe2=new Employee("Manoj",34);
        list.put(1,employe1);
        list.put(2,employe2);


        Employee obj=list.get(1);
        System.out.println(obj.name);
        System.out.println(obj.age);

        obj=list.get(2);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

    public static void main(String[] args) {
        EmployeeHashMap obj=new EmployeeHashMap();
        obj.first();
    }
}
