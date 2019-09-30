package PackageOne;

public class VariableScope {

    int classLevelAccess=0;

    public void methodOne(){

        int methodLevelAccess = 0;

        for (int driver = 0; driver < 10; driver++) {

            int blockLevelAccess = 0;

            // all variables are visible to this location
            classLevelAccess = 10;
            methodLevelAccess = 10;
            blockLevelAccess = 10;
            System.out.println(classLevelAccess + " " + methodLevelAccess + " " + blockLevelAccess);

        }

        // blockLevelAccess not visible outside the for loop
//        blockLevelAccess = 20;

        // classLevelAccess is visible outside the for loop
        classLevelAccess = 20;

        // methodLevelAccess is visible outside the for loop
        methodLevelAccess = 20;

        System.out.println(classLevelAccess + " " + methodLevelAccess);

    }

//    public static void main(String[] args) {

    // blockLevelAccess not visible outside the method implementation
    blockLevelAccess = 30;

    // classLevelAccess is visible outside the for loop
    classLevelAccess = 30;

    // methodLevelAccess is visible outside the for loop
    methodLevelAccess = 30;

//    }

}
