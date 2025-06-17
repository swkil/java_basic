import java.util.Arrays;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class Util1 {
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

@FunctionalInterface
interface A1 {
    public void say(String name);
}

public class Lambda {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println(add.operate(2, 4));
        System.out.println(multiply.operate(3, 5));

        String[] name = {"Alice", "Bob", "Charlie"};

//        for (String n : name) {
//            System.out.println(n);
//        }

        Arrays.stream(name).forEach(n -> System.out.println(name));
        Arrays.stream(name).forEach(System.out::println);

        A1 a = Util1::sayHello;
        a.say("Alice");
    }
}
