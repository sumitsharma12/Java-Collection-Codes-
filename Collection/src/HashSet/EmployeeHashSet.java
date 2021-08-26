package HashSet;

import java.util.HashSet;

public class EmployeeHashSet {
    public void listofemployee(){
        HashSet <Employee> list=new HashSet<Employee>();
        Employee employe1=new Employee("sumit",22);
        Employee employe2=new Employee("manoj",34);
        list.add(employe1);
        list.add(employe2);
        for (Employee object:list){
            System.out.println(object.name);
            System.out.println(object.age);
        }
    }

    public static void main(String[] args) {
        EmployeeHashSet obj=new EmployeeHashSet();
        obj.listofemployee();
    }
}
