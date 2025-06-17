public class Finally {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("Cleanup: This block always executes.");
        }

        String input = "123a";

        try{
            int number = Integer.parseInt(input);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to parse the input.");
        } finally {
            System.out.println("Process completed.");
        }
    }
}
