public class TryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String input = "123a";

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println("Error: Division by zero.");
        }

        try {
            int number = Integer.parseInt(input);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}
