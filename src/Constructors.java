class Person2 {
    String name;
    int age;

    public Person2() {}

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void hello() {
        System.out.println("hello " + name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Person2 person = new Person2("Bob", 18);
        person.hello();

        Person2 person1 = new Person2();
        person1.name = "Mike";
        person1.hello();
    }
}
