package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {
    private static HashMap<Character, Integer> contains = new HashMap<>();

    public static Map<Character, Integer> contains(String string) {
//        for (char c : string.toCharArray()) {
//            if (contains.containsKey(c)) {
//                contains.put(c, contains.get(c) + 1);
//            } else contains.put(c, 1);
//        }
        for (char c : string.toCharArray()) {
            Map.Entry<Character, Integer> ent = findItToAdd(c, contains);
            if (ent != null) {
                contains.put(ent.getKey(), ent.getValue() + 1);
            } else {
                contains.put(c, 1);
            }
        }
        return contains;
    }

    private static Map.Entry<Character, Integer> findItToAdd(char c, Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(c)) {
                return entry;
            }
        }
        return null;
    }
}