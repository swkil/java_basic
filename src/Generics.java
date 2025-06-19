import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public <E> void printContent(E extraInfo) {
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }

    public static <T> void displayArray(T[] array) {
        for (T a : array) {
            System.out.println(a);
        }
    }

    public static <T> void displayArrayList(List<T> array) {
        for (T a : array) {
            System.out.println(a);
        }
    }
}

public class Generics {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Box");
        System.out.println(stringBox.getContent());

        stringBox.setContent("BOX!!!");
        System.out.println(stringBox.getContent());

        stringBox.printContent(true);

        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"apple", "banana", "cherry"};

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(100);
        numbers1.add(200);
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");

        Box.displayArray(numbers);
        Box.displayArray(words);
        Box.displayArrayList(numbers1);
        Box.displayArrayList(fruits);

        List<Integer> numbers2 = new ArrayList<>(List.of(1, 2, 3));
        List<String> words1 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        Box.displayArrayList(numbers2);
        Box.displayArrayList(words1);
    }
}
