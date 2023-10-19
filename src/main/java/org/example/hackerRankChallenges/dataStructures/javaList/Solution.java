package org.example.hackerRankChallenges.dataStructures.javaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfElementsInList = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numberOfElementsInList; i++) {
            list.add(sc.nextInt());
        }
        int numberOfQueries = sc.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            String query = sc.next();

            if ("Insert".equals(query)) {
                int index = sc.nextInt();
                int element = sc.nextInt();
                list.add(index, element);
            } else {
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        StringBuffer sb = new StringBuffer();

        for (Integer i : list) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}