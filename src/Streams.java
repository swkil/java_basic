import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream();

        Integer[] abc = {1, 2, 3};
        Stream<Integer> s2 = Arrays.stream(abc);

        int result = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();// 2, 4

        System.out.println(result);

        List<Double> values = Arrays.asList(10.0, 20.0, 30.0);

        double avg = values.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(avg);
    }
}
