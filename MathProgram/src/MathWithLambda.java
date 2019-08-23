public class MathWithLambda {

    public static void main(String[] args) {
        //Lambda expression
        Math m = x->x*x;
        System.out.println("With lambda - "+m.power(25));
    }
}
