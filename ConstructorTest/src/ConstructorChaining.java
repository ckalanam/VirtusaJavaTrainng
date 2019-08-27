public class ConstructorChaining {

    String a;
    int b;

    ConstructorChaining(){
        this(">> This is the value ! <<");
    }
    ConstructorChaining(String wordString){
        this(wordString, 10);
    }
    ConstructorChaining(String word, int val){
        this.a=word;
        this.b=val;
        System.out.println("String word is "+a+"\nInteger value is "+b);
    }

    public static void main(String[] args) {
        ConstructorChaining object = new ConstructorChaining();
    }
}
