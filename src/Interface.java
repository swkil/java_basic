import java.lang.Override;

interface Animal2 {
    void makeSound();
}

class Dog2 implements Animal2 {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal2 dog = new Dog2();

        dog.makeSound();
    }
}
