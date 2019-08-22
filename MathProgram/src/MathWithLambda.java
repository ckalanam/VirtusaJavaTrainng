public class MathWithLambda {

    public static void main(String[] args) {
        Math m = x->x*x;
        System.out.println("With lambda - "+m.power(25));
    }
}
