public class Functions {
    public static void printStudent(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("------------");
    }

    public static int addNumber(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("=== 학생 정보 출력 ===");
        Functions.printStudent("Alice", 20);
        printStudent("Bob", 22);

        int number = addNumber(10, 7);
        System.out.println(number);
        number = addNumber(12, 7);
        System.out.println(number);
    }
}
