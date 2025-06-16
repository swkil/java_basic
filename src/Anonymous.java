import java.lang.Override;

interface Greeting {
    void greet();
}

interface Calculator {
    int compute(int a, int b);
}

public class Anonymous {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class");
            }
        };

        greeting.greet();

        Calculator mul = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a * b;
            }
        };

        Calculator square = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return (int) Math.pow(a*b, 2);
            }
        };

        System.out.println(mul.compute(3, 4));
        System.out.println(square.compute(3, 4));
    }
}
