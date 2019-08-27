import java.time.LocalDateTime;

public class ConstructorTest {

    String testString = null;
    int testInt = 0;

    public ConstructorTest(String variableString, int variableInt){
        System.out.println("\n********** Constructor back in action ************");
        this.testString = variableString;
        this.testInt = variableInt;
    }

    public static void main(String[] args) {

        //displaying the current time
        LocalDateTime timeDisplay = LocalDateTime.now();
        System.out.println("\nCurrent date & time : "+timeDisplay);

        //implementation of a constructor
        ConstructorTest objectConstructor = new ConstructorTest("Chethana_Mahindapala", 8064287);
        System.out.println("\nYour name is "+objectConstructor.testString);
        System.out.println("Your employee ID is "+objectConstructor.testInt);
    }
}
