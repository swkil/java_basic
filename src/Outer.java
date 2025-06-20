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
    private String data = "Outer data";

    class Inner {
        void displayMessage() {
            System.out.println(message);
        }

        void printData() {
            System.out.println(data);
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.displayMessage();
    }

    public Inner createInner() {     // 반환타입이 Inner 여서
        return new Inner();          // return 값으로 new Inner(); 가능
    }                                // 즉, 메소드 호출로 Inner 클래스 인스턴스를 만드는 메소드

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        Outer.Inner inner = outer.new Inner();
        inner.displayMessage();

        inner = outer.createInner();
        inner.displayMessage();
        // outer = null;
        // inner = null;

        // System.gc();
        // System.out.println("Outer와 Inner는 더 이상 사용X");

        Car2 car = new Car2("빠른 자동차");
        car.startEngine();

        Car2.StaticInner staticInner = new Car2.StaticInner();
        staticInner.hello();

        Outer.Inner inner1 = outer.createInner(); // Inner 클래스 인스턴스를 만드는 메소드
        // outer.new Inner(); 로 대체 가능
        inner1.printData();
        outer = null;                           // outer 메모리를 날려도
        inner1.printData();                      // 실행 됨
        inner1 = null;                           // inner 메모리 날리면
//      inner1.printData();                      // 실행 안됨
        System.gc();                            // 가비지 컬렉터 호출 요청
        System.out.println("Outer와 Inner는 더 이상 사용되지 않음");
    }
}
