package ArrayTest;

import java.util.ArrayList;

public class TestingArray {

    public static void main(String[] args) {
        ArrayList arrayObject = new ArrayList();
        //ArrayList() is a default constructor. while calling it is creating an array with a length of 10 indexes

        for (int i=10;i<=20;i++)
            arrayObject.add(i);

        int j=arrayObject.size();

        arrayObject.add(j++);
        arrayObject.add(null); // inserting null value is possible
        arrayObject.add("chetha");
        arrayObject.add(12.33);
        arrayObject.add(1,100);

        System.out.println(arrayObject);
        System.out.println(arrayObject.size());
        System.out.println(arrayObject.get(1));
    }
}
