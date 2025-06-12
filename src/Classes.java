class Person1 {
    String name;
    int age;
    String mbti;

    public void sayHello() {
        System.out.println("안녕하세요? 저는 " + name + "입니다.");
        System.out.println("저의 나이는 " + age + "살 입니다.");
        System.out.println("저의 MBTI는 " + mbti.toUpperCase() + "입니다.");
    }

    public void work() {
        System.out.println("일하는 중...");
    }
}

class Car1 {
    String brand;
    int year;
    String color;

    public void displayInfo() {
        System.out.println("이 차의 브랜드는 " + brand + "입니다.");
        System.out.println("이 차의 연식은 " + year + "년식 입니다.");
        System.out.println("이 차의 색상은 " + color + "색 입니다.");
    }
}

public class Classes {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.name = "Alice";
        person.age = 20;
        person.mbti = "enfp";

        person.sayHello();
        person.work();

        Car1 car = new Car1();
        car.brand = "포르쉐";
        car.year = 2020;
        car.color = "빨강";

        car.displayInfo();
    }
}
