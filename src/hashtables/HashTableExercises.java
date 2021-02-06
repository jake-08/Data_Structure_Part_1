package hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {
    // Time Complexity - O(n)
    public int mostFrequent(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }
        System.out.println(map);
        int max = -1;
        int result = numbers[0];
        for (var entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    // O(n) **
    public int countPairsWithDiff(int[] numbers, int k) {
        Set<Integer> set = new HashSet<>();
        for (var num : numbers) {
            set.add(num);
        }
        int count = 0;
        for (var num: numbers) {
            if (set.contains(num + k))
                count++;
            if (set.contains(num - k))
                count++;
            set.remove(num);
        }
        return count;
    }

    // O(n)
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //Mosh Method
        int index = 0;
        for (var num : numbers) {
            map.put(num, index++);
        }

        for (int i = 0; i < numbers.length; i++) {
            int result = target - numbers[i];
            if (map.containsKey(result)) {
                return new int[] {map.get(result), i};
            }
            map.put(numbers[i], i);
        }
        return null;

        //Jake Method
//        int index = 0;
//        for (var num : numbers) {
//            map.put(index++, num);
//        }
//        int index2 = 0;
//        int[] numIndex= new int[2];
//        for (var entry : map.entrySet()) {
//            if (map.containsValue(target - entry.getValue())) {
//                numIndex[index2] = entry.getKey();
//                index2++;
//            }
//        }
//        return numIndex;
    }
}
