import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Cherry");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("--------");

//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits.get(i));
//        }
//
//        Iterator<String> it = fruits.iterator();
//        while (it.hasNext()) {
//            String item = it.next();
//            System.out.println(item);
//        }

        Collections.sort(fruits);
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        if (fruits.contains("Apple")) {
            System.out.println("Apple은 포함되어 있습니다.");
        }

        fruits.add("Tomato");
        fruits.remove("Tomato");
        fruits.remove(3);

        // fruits.clear();
        System.out.println(fruits.size());

        System.out.println(fruits.isEmpty());

        System.out.println(fruits.indexOf("Banana"));
        fruits.set(1, "Orange");

        List<String> sliced = fruits.subList(0, 2);
        for (String s : sliced) {
            System.out.println(s);
        }

    }
}
