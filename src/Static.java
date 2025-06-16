class Person3 {
    int a = 0;
    static int b = 1;

     public static void greet() {
        System.out.println("Hello");
        // System.out.println(a); 인스턴스 접근 불가
         System.out.println(b);
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class Static {
    public static void main(String[] args) {
        Person3.greet();

        Person3 person = new Person3();
        person.sayHello();
    }
}
