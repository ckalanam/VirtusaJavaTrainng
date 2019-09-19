package UniversityPackage;

import java.util.Scanner;

public class ApplicationOne {

    public static void main(String[] args) {
/*
        Scanner inputValue1 = new Scanner(System.in);
        System.out.println("1) Enter the name of the student - ");
        String typedName = inputValue1.nextLine();

        Scanner inputValue2 = new Scanner(System.in);
        System.out.println("2) Enter the index number of the student - ");
        String typedIndexNo = inputValue2.nextLine();

        Scanner inputValue3 = new Scanner(System.in);
        System.out.println("3) Enter the type of the course - ");
        String typedCourseType = inputValue3.nextLine();

        Scanner inputValue4 = new Scanner(System.in);
        System.out.println("4) Enter the average marks of the student - ");
        String typedAVGMarksString = inputValue4.nextLine();
        double typedAVGMarksDouble = Double.valueOf(typedAVGMarksString);

        Student object = new Student(name,indexNo,typedCourseType,typedAVGMarksDouble);

        System.out.println("\n\n"+object.getName()+"::"
                +object.getIndexNo()+"::"+object.getCourseType()
                +"::Your Grade is "+object.gradeFinderMethod(object.getAVGMark()));

       System.out.println(object.getName()+"::"
                +object.getIndexNo()+"::"+object.getCourseType()
                +"::Your Grade is "+object.gradeFinderMethod(typedAVGMarksDouble));
 */

        InputClass objInputClass = new InputClass();
        objInputClass.inputMethod();

        Student objStudent = new Student(objInputClass.name,objInputClass.indexNo,objInputClass.courseType,objInputClass.avgMark);
        objStudent.publishGradeMethod();

        System.out.println(objInputClass.avgMark);

    }

}
