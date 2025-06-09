import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(numbers));
//
//        System.out.println(numbers.length);
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[numbers.length - 1 - i]);
//        }
        int[] array = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
