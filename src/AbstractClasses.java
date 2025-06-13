import java.lang.Override;

abstract class Animal3 {
    abstract void makeSound();

    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}


public class AbstractClasses {
    public static void main(String[] args) {
        Animal3 dog = new Dog3();

        dog.makeSound();
        dog.sleep();
    }
}
