package chap21;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<String, Integer> treeMap1 = new TreeMap<>(Comparator.comparing(String::length));
        treeMap1.putAll(hashMap);
        System.out.println(treeMap1);

        for (Map.Entry<String, Integer> entry : treeMap1.entrySet()) {
            entry.setValue(entry.getValue() + 1);
        }
        System.out.println(treeMap1);
    }
}
