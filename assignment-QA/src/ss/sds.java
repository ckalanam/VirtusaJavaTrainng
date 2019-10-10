package ss;

public class sds {

    public static void main(String[] args) {
        sds obj = new sds();

        System.out.println(obj.findGradeMethod(55));
    }
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
}
