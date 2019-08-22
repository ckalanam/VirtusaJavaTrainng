public class MathWithOutLambda {

    public static void main(String[] args) {
        Math m = new Math() {
            public int power(int x) {
                return x * x;
            }
        };
        System.out.println("With out lambda - "+m.power(25));
    }

}

