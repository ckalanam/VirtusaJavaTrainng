package UniversityPackage;

import java.util.Scanner;

public class Course {

    String name;
    String indexNo;
    String courseType;
    double AVGMark;

    /*public Course() {

    }*/

    public Course(String name, String indexNo, String courseType, double AVGMark) {
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

}
