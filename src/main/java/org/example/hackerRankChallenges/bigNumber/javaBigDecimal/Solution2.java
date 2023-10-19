package org.example.hackerRankChallenges.bigNumber.javaBigDecimal;

import java.math.BigDecimal;
import java.util.*;

class Solution2 {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Create a TreeMap with a custom comparator to achieve reverse sorting.
        Map<String, BigDecimal> map = new TreeMap<>(
                Comparator.reverseOrder()
        );

        for (String string : s) {
            if (string != null) {
                map.put(string, new BigDecimal(string));
            }
        }

        List<String> strings = map.keySet().stream().toList();
        for (int i = 0; i < strings.size(); i++) {
            s[i] = strings.get(i);
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}