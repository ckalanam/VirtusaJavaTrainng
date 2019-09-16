package chethana.encap;

import chethana.encap.hide.Bus;

public class Application {

    public static void main(String[] args) {

        BusStation busStation = new BusStation();
        busStation.addBus("Green");
        busStation.addBus(busStation.new Bus("Red"));
        busStation.addBus(new BusStation().new Bus("Blue"));

        /*for(Bus bus:BusStation.buses) {
            System.out.println(bus);
//            System.out.println(bus.getColor()); //after adding of the toString() method in Bus class
        }*/

        busStation.getBuses();
    }

}
