import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {
    public static void printElements(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static double sumList(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
                sum += n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("A", "B", "C");

        printElements(numbers);
        printElements(words);

        System.out.println("합계: " + sumList(numbers));
    }
}
