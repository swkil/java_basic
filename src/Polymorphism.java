import java.lang.Override;

class Animal1 {
    public void makeSound() {
        System.out.println();
    }
}

class Dog1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

class Bird1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }
}

class Shape {
    double area;

    public double area() {
        return area;
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal1 a1 = new Dog1();
        Animal1 a2 = new Cat1();
        Animal1 a3 = new Bird1();

        Animal1[] animals = {a1, a2, a3};

        for (Animal1 animal : animals) {
            animal.makeSound();
        }

        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);

        Shape[] shapes = {circle, rectangle};

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}
