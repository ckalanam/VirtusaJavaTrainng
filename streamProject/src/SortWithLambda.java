import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {
    public static void main(String[] args){
        List<Student> students = Student.getStudent();
        System.out.println("1). Before sorting with lambda :");
        System.out.println(students);

        Comparator<Student> studentComparator = (s1,s2)->(s1.getId()<s2.getId()?-1:s1.getId()>s2.getId()?1:0);
        Collections.sort(students,studentComparator);
        System.out.println("\n2). After sorting with lambda :");
        System.out.println(students);
    }
}
