import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {

   public static void main(String[] args){
       List<Student> students = Student.getStudent();
       System.out.println("1). Before :");
       System.out.println(students);

       Collections.sort(students,new StudentRanker());
       System.out.println("\n2). After :");
       System.out.println(students);
   }


}
