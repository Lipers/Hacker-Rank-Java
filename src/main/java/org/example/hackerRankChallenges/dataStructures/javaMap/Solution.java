package org.example.hackerRankChallenges.dataStructures.javaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> users = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            users.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String name = in.nextLine();
            Integer phoneNumber = users.get(name);
            System.out.println(phoneNumber != null ? name + "=" + phoneNumber : "Not found");
        }
    }
}



