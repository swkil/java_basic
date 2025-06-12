class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("이름: " + name);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name,  String breed) {
        super(name);
        this.breed = breed;
    }

    @java.lang.Override
    public void printName() {
        System.out.println("이름: " + name + ", 종: " + breed);
    }
}

public class Override {
    public static void main(String[] args) {
        Dog dog = new Dog("별이", "말티즈");
        dog.printName();
    }
}
