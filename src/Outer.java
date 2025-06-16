class Car2 {
    String brand;
    Engine engine;

    public Car2(String brand) {
        this.brand = brand;
        this.engine = new Engine();
    }

    class Engine {
        public void start() {
            System.out.println("The engine of " + brand + " is starting.");
        }
    }

    static class StaticInner {
        void hello() {
            System.out.println("Hi");
        }
    }

    public void startEngine() {
        engine.start();
    }
}

class OutSecret {
    private class HiddenInner {
        void secret() {
            System.out.println("private");
        }
    }

    public void reveal() {
        HiddenInner hi = new HiddenInner();
        hi.secret();
    }
}

public class Outer {
    private String message = "Hello";

    class Inner {
        void displayMessage() {
            System.out.println(message);
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.displayMessage();
    }

    public Inner createInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        Outer.Inner inner = outer.new Inner();
        inner.displayMessage();

        inner = outer.createInner();
        inner.displayMessage();
        outer = null;
        inner = null;

        System.gc();
        System.out.println("Outer와 Inner는 더 이상 사용X");

        Car2 car = new Car2("빠른 자동차");
        car.startEngine();

        Car2.StaticInner staticInner = new Car2.StaticInner();
        staticInner.hello();
    }
}
