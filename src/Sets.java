import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("Kiwi");
        fruits.add("kiwi");

        for (String fruit : fruits) {
            System.out.println(fruit + ": " + fruit.hashCode());
        }

        System.out.println("-------------");

        Set<String> fruits1 = new LinkedHashSet<>();

        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("banana");
        fruits1.add("apple");
        fruits1.add("Kiwi");
        fruits1.add("kiwi");

        for (String f1 : fruits1) {
            System.out.println(f1);
        }

        System.out.println("-------------");

        Set<String> fruits2 = new TreeSet<>();

        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("banana");
        fruits2.add("apple");
        fruits2.add("Kiwi");
        fruits2.add("kiwi");

        for (String f2 : fruits2) {
            System.out.println(f2);
        }
    }
}
