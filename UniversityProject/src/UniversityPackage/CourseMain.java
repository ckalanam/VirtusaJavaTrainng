package UniversityPackage;

import java.util.Scanner;

public class CourseMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1) Enter the name of the student - ");
        String typedName = input.nextLine();
//        object.setName(typedName);
        Scanner input2 = new Scanner(System.in);
        System.out.println("2) Enter the index number of the student - ");
        String typedIndexNo = input2.nextLine();
        Scanner input3 = new Scanner(System.in);
        System.out.println("3) Enter the type of the course - ");
        String typedCourseType = input3.nextLine();
        Scanner input4 = new Scanner(System.in);
        System.out.println("4) Enter the average marks of the student - ");
        String typedAVGMarksString = input4.nextLine();
        double typedAVGMarksDouble = Double.valueOf(typedAVGMarksString);

        Course object = new Course(typedName,typedIndexNo,typedCourseType,typedAVGMarksDouble);

        System.out.println("\n\n"+object.getName()+"::"
                +object.getIndexNo()+"::"+object.getCourseType()
                +"::Your Grade is "+object.courseTypeFinderMethod(object.getAVGMark()));
//        System.out.println(object.getName()+"::"
//                +object.getIndexNo()+"::"+object.getCourseType()
//                +"::Your Grade is "+object.courseTypeFinderMethod(typedAVGMarksDouble));
    }

}
