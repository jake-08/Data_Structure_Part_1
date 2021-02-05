package hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Key: Employee Number (Integer)
        // Value: Name (String)
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Mosh");
//        map.put(2, "John");
//        map.put(3, null);
//        System.out.println(map.get(2));
//        map.remove(2);
//        System.out.println(map.containsKey(3));
//        for (var item : map.entrySet()) {
//            System.out.println(item.getValue());
//        }
        // Sets
//        Set<Integer> set = new HashSet<>();
//        int[] numbers = { 1, 2, 3, 1, 2, 2, 4, 5, 6};
//        for (var num : numbers) {
//            set.add(num);
//            set.remove(num);
//            set.clear();
//            set.removeAll(set);
//        }
//        System.out.println(set);

        // HashTable
        HashTable table = new HashTable();
        table.put(2, "A");
        table.put(3, "B");
        table.put(4, "C");
        table.put(12, "A*");
        table.remove(2);
        System.out.println("Done");
        System.out.println("Done");

    }
}
