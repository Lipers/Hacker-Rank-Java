package org.example.hackerRankChallenges.bigNumber.javaBigDecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReverseSortMap {

    // A method that takes a map of String and BigDecimal and returns a list of the keys in reversed sorted order by their values
    public static List<String> reverseSortByValue(Map<String, BigDecimal> map) {
        // Create a list of map entries
        List<Map.Entry<String, BigDecimal>> entries = new ArrayList<>(map.entrySet());

        // Sort the list by the values in descending order using a custom comparator
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Create a list of keys
        List<String> keys = new ArrayList<>();

        // Loop through the sorted entries and add the keys to the list
        for (Map.Entry<String, BigDecimal> entry : entries) {
            keys.add(entry.getKey());
        }

        // Return the list of keys
        return keys;
    }
}