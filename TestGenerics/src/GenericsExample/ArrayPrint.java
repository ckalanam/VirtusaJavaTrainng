package GenericsExample;

public class ArrayPrint {

    public <E> void printArray(E[] arrayObj){
        for (E e : arrayObj){
            System.out.println(e);
        }
        System.out.println("Testing");
    }
}
