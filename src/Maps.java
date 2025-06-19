import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("Apple", 17980);
        fruitPrices.put("Pear", 10320);
        fruitPrices.put("Watermelon", 15920);
        fruitPrices.put("Melon", 10630);

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue() + " won.");
        }

        int sum = 0;
        for (int fp : fruitPrices.values()) {
            sum += fp;
        }
        double avg = (double)sum / fruitPrices.size();
        System.out.println(avg);

        System.out.println(fruitPrices.containsKey("Apple"));
        System.out.println(fruitPrices.containsValue(20000));

        System.out.println(fruitPrices.getOrDefault("Apple", 500));
        System.out.println(fruitPrices.getOrDefault("Grape", 500));

        fruitPrices.replace("Apple", 3000);
        fruitPrices.remove("Melon");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        for (String key : fruitPrices.keySet()) {
            System.out.println(key);
        }

        Map<String, Integer> fruitPricesTree = new TreeMap<>();
        fruitPricesTree.put("Banana", 50);
        fruitPricesTree.put("Apple", 150);
        fruitPricesTree.put("Cherry", 200);

        for (Map.Entry<String, Integer> entry : fruitPricesTree.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
