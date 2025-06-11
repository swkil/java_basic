public class PrintMethod {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.print("Java");

        System.out.println();
        System.out.println("Hello ");
        System.out.println("Java");

        String name = "Son";
        int backNumber = 7;
        System.out.println((name + backNumber).getClass().getName());
        System.out.println(((Object) backNumber).getClass().getName());

        System.out.println("\"Hello\"");
        System.out.println("\\ 역슬래시 출력");
        System.out.println("Name:\tAlice");
        System.out.println("Hello\nJava");

        int age = 20;
        double pi = 3.14159;
        System.out.printf("나이: %d, 원주율: %.2f\n", age, pi);
    }
}
