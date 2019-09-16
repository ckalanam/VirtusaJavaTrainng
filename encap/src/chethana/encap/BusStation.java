package chethana.encap;

import java.util.ArrayList;

public class BusStation {

//    there are 4 encapsulation levels. Refer !

//    public static ArrayList<Bus> buses;
    public ArrayList<Bus> buses = new ArrayList<>();

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public BusStation() {
    }

    public BusStation(String color) {
        buses.add(new Bus(color));
    }

    /*public void addBus(String color){
        buses.add(new Bus(color));
    }*/

    public void addBus(Bus bus){
        buses.add(bus);
    }

    public void validate(String color){
//        private int x; //why ??
        class BusValidator{

            public void validate(){
                if("Red".equalsIgnoreCase(color)){
                    System.out.println("Valid");
                }else{
                    System.out.println("Invalid");
                }
            }

        }

        /*for(int x=0;x<10;x++)
            System.out.println(x);*/
    }


    /*static{

        buses =  new ArrayList<>();
        buses.add(new Bus("Red"));
        buses.add(new Bus("Green"));
        buses.add(new Bus("White"));
        buses.add(new Bus("Blue"));
        buses.add(new Bus("Pink"));

    }*/

//    copying bus class from bus.java
    public class Bus {

    public Bus() {
    }

    private String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Bus(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Bus{" +
                    "color='" + color + '\'' +
                    '}';
        }


    }
}
