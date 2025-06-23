import java.lang.Override;

class Animal4 {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog4 extends Animal4 {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Calculator1 {
    /**
     * @deprecated Use {@link #addNumber(int, int)} instead.
     */
    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }

    public int addNumber(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface Greeting1 {
    void sayHello(String name);
    // void anotherMethod();
}

public class Annotation {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        Animal4 dog = new Dog4();
        dog.sound();

        Calculator1 calculator = new Calculator1();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.addNumber(2, 4));

        java.util.List list = new java.util.ArrayList();
        list.add("Hello");
        list.add("World");
        for (Object obj: list) {
            System.out.println(obj);
        }

        Greeting1 greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("Alice");
    }
}
