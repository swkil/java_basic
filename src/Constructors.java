class Person {
    String name;
    int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void hello() {
        System.out.println("hello " + name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Person person = new Person("Bob", 18);
        person.hello();

        Person person1 = new Person();
        person1.name = "Alice";
        person1.hello();
    }
}
