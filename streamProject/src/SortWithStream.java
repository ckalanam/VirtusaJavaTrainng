import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortWithStream {
    public static void main(String[] args) {
        List<Student> students = Student.getStudent();
        System.out.println("1). Before sorting :");
        System.out.println(students);

        List<Student> students1 = Student.getStudent().stream()
                .sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
        System.out.println("\n2). After sorting by Comparator.comparing");
        System.out.println(students1);

        List<Student> students2 = Student.getStudent().stream()
                .sorted((s1,s2)->new Integer(s1.getId()).compareTo(s2.getId())).collect(Collectors.toList());
        System.out.println("\n3). After sorting by CompareTo");
        System.out.println(students2);

        List<Student> students3 = Student.getStudent().stream()
                .sorted((s1,s2)->-new Integer(s1.getId()).compareTo(s2.getId())).collect(Collectors.toList());
        System.out.println("\n4). After sorting by reverse CompareTo");
        System.out.println(students3);
    }
}
