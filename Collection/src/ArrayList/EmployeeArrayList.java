package ArrayList;

import java.util.ArrayList;

public class EmployeeArrayList {
    public  void first(){
        ArrayList <Employee> newlist=new ArrayList<Employee>();
        Employee employee1=new Employee("sumit",222);
        Employee employee2=new Employee("Manoj",456);
         newlist.add(employee1);
         newlist.add(employee2);

for (Employee object:newlist){
    System.out.println(object.name);
    System.out.println(object.id);
}
    }

    public static void main(String[] args) {
        EmployeeArrayList obj=new EmployeeArrayList();
        obj.first();
    }
}
