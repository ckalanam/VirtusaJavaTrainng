package UniversityPackage;

import java.util.Scanner;

public class InputClass {

    String name;
    String indexNo;
    String courseType;
    double avgMark;

    public void inputMethod(){

        Scanner inputValue1 = new Scanner(System.in);
        System.out.println("1) Enter the name of the student - ");
        name = inputValue1.nextLine();

        Scanner inputValue2 = new Scanner(System.in);
        System.out.println("2) Enter the index number of the student - ");
        indexNo = inputValue2.nextLine();

        Scanner inputValue3 = new Scanner(System.in);
        System.out.println("3) Enter the type of the course - ");
        courseType = inputValue3.nextLine();

        Scanner inputValue4 = new Scanner(System.in);
        System.out.println("4) Enter the average marks of the student - ");
        String typedAVGMarksString = inputValue4.nextLine();
        avgMark = Double.valueOf(typedAVGMarksString);

//        publishGradeMethod();

    }
}
