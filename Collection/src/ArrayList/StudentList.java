package ArrayList;
import java.util.*;
public class StudentList {
    public  void first(){
        ArrayList<Student> total=new ArrayList<Student>();
      Student  Student1=new Student("sumit sharma",26);
      Student Student2=new Student("sushant",24);
      total.add(Student1);
      total.add(Student2);

      for(Student obj:total){
          System.out.println(obj.getName());
          System.out.println(obj.getAge());
      }
    }

    public static void main(String[] args) {
        StudentList ob=new StudentList();
        ob.first();
    }
}
