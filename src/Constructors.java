class Person {
    String name;
    int age;

    public Person(String inputName, int inputAge) {
        this.name = inputName;
        this.age = inputAge;
    }

    void hello() {
        System.out.println("hello " + name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Person person = new Person("Bob", 18);
        person.hello();
    }
}
