package UniversityPackage;

import java.util.Scanner;

public class Student {

    String name;
    String indexNo;
    String courseType;
    double avgMark;

/*

    public Student() {

    }
*/

    public Student(String name, String indexNo, String courseType, double avgMark) {

        this.setName(name);
        this.setIndexNo(indexNo);
        this.setCourseType(courseType);
        this.setAVGMark(avgMark);

    }

    public String getName() {
        return name;
    }

    public void setName(String setName) {
        this.name = setName;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public double getAVGMark() {
        return avgMark;
    }

    public void setAVGMark(double avgMark) {
        this.avgMark = avgMark;
    }

/*

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

        publishGradeMethod();

    }
*/

    public String findGradeMethod(double inputDouble){

        String result = null;

        if(inputDouble > 75){
            result = "A";
        }else if(inputDouble > 65){
            result = "B";
        }else if(inputDouble > 55){
            result = "C";
        }else{
            result = "PASS";
        }
        return result;

    }

    public void publishGradeMethod(){

        System.out.println("\n\n"+getName()+"::"
                +getIndexNo()+"::"+getCourseType()
                +"::Your Grade is "+findGradeMethod(avgMark));

    }

}
