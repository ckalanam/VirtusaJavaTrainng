import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
        System.out.println("1) Print students with short names\n");
        printStudentsWithShortNames();
        System.out.println("\n2) Filter with stream\n");
        filterWithStream();
        System.out.println("\n3) Process with 'Dr'\n");
        process();
        System.out.print("\n4) Student count - ");
        countStudents();
        System.out.print("\n5) Max student's ID - ");
        maxStudent();
        System.out.print("\n6) Min student's ID - ");
        minStudent();
    }

    static void minStudent(){
        Student minId = Student.getStudent().stream().min(Comparator.comparing(s->s.getId())).get();
        System.out.println(minId.getId());
    }

    static void maxStudent(){
        Student maxId = Student.getStudent().stream().max(Comparator.comparing(s->s.getId())).get();
        System.out.println(maxId.getId());
    }

    static void countStudents(){
        long students = Student.getStudent().stream().count();
        System.out.println(students);
    }

    static void process(){

        // with out for each keyword
        /*List <Student> students = Student.getStudent()
                .stream().map(s->new Student("Dr "+s.getName(),s.getId()))
                .collect(Collectors.toList());
        System.out.println("\n"+students);*/

        // with for each keyword
        Student.getStudent()
                .stream().map(s->new Student("Dr "+s.getName(),s.getId()))
                .collect(Collectors.toList()).forEach(s-> System.out.println(s));
    }

    static void filterWithStream(){
        List<Student> students = Student.getStudent()
                .stream().filter(s->s.getName().length()<=6)
                .collect(Collectors.toList());
        System.out.println(students);
    }

    static void printStudentsWithShortNames(){
        List<Student> students = Student.getStudent();

        for (Student student:students){
            if (student.getName().length()<=6)
                System.out.println(student.getName());
            }
    }
}
