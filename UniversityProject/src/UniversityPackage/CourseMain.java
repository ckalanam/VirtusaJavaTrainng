package UniversityPackage;

import java.util.Scanner;

public class CourseMain {

<<<<<<< HEAD
=======
    String name;
    String indexNo;
    String courseType;
    double AVGMark;

    /*public CourseMain() {

    }*/

    public CourseMain(String name, String indexNo, String courseType, double AVGMark) {
//        this.name = name;
        this.setName(name);
//        this.indexNo = indexNo;
        this.setIndexNo(indexNo);
//        this.courseType = courseType;
        this.setCourseType(courseType);
//        this.AVGMark = AVGMark;
        this.setAVGMark(AVGMark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return AVGMark;
    }

    public void setAVGMark(double AVGMark) {
        this.AVGMark = AVGMark;
    }

>>>>>>> 2678fe7d31225e784b421c25b599ac61eec795d4
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

<<<<<<< HEAD
        Course object = new Course(typedName,typedIndexNo,typedCourseType,typedAVGMarksDouble);
=======
        CourseMain object = new CourseMain(typedName,typedIndexNo,typedCourseType,typedAVGMarksDouble);
>>>>>>> 2678fe7d31225e784b421c25b599ac61eec795d4

        System.out.println("\n\n"+object.getName()+"::"
                +object.getIndexNo()+"::"+object.getCourseType()
                +"::Your Grade is "+object.courseTypeFinderMethod(object.getAVGMark()));
//        System.out.println(object.getName()+"::"
//                +object.getIndexNo()+"::"+object.getCourseType()
//                +"::Your Grade is "+object.courseTypeFinderMethod(typedAVGMarksDouble));
    }

<<<<<<< HEAD
=======

    public String courseTypeFinderMethod(double inputDouble){

        String result = null;

        if(inputDouble > 75){
            result = "A";
        }else if(inputDouble>65){
            result = "B";
        }else if(inputDouble>55){
            result = "C";
        }else{
            result = "PASS";
        }
        return result;
    }

>>>>>>> 2678fe7d31225e784b421c25b599ac61eec795d4
}
