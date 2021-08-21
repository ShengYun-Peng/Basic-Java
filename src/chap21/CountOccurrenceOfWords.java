package chap21;

import java.util.*;

public class CountOccurrenceOfWords {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class. Have a good visit. Have fun!";

        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[\\s+\\p{P}]");

        for (String key : words) {
            key = key.toLowerCase();
            if (key.length() > 0) {
                if (map.containsKey(key)) {
                    int value = map.get(key);
                    ++value;
                    map.put(key, value);
                } else {
                    map.put(key, 1);
                }
            }
        }

        // sort map according to the value rather than key
        Map<String, Integer> newMap = sortByValue(map);

        // another way to sort it
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<String, Integer> e : list)
            System.out.println(e.getKey() + " " + e.getValue());

        newMap.forEach((word, count) -> System.out.println(String.format("%-10s", word) + count));
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        ArrayList<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        // explicitly write the type <K, V> to use reversed
        list.sort(Map.Entry.<K, V>comparingByValue().reversed());

        LinkedHashMap<K, V> map1 = new LinkedHashMap<>();
        list.forEach(e -> map1.put(e.getKey(), e.getValue()));

        return map1;
    }
}

