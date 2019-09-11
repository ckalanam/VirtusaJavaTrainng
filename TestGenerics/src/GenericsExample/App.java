package GenericsExample;

import java.io.CharArrayReader;
import java.lang.reflect.Array;

public class App {

    public static void main(String[] args) {

        Car carObj = new Car();
        Bus busObj = new Bus();
        Dog dogObj = new Dog();

        Vehicle<Car> carVehicleObj = new Vehicle<>(carObj);
        Vehicle<Bus> busVehicleObj = new Vehicle<>(busObj);
//        Vehicle<Dog> dogVehicle = new Vehicle<>(dogObj);

        carVehicleObj.drive();
        busVehicleObj.drive();
//        dogVehicle.drive();

        ArrayPrint arrayPrintObj = new ArrayPrint();
        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"A","B","C","D"};

        arrayPrintObj.printArray(integers);
        arrayPrintObj.printArray(strings);

    }
}
