public class TextPrinter {

    public static void main(String[] args){
        Printer p = new Printer() {
            @Override
            public void print() {
                System.out.println("Hi");
            }
        };
        p.print();
    }

}
