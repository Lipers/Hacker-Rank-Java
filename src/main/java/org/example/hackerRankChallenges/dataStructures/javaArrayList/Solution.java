package org.example.hackerRankChallenges.dataStructures.javaArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> listListElements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int elements = sc.nextInt();
            List<Integer> listIntegers = new ArrayList<>();
            for (int j = 0; j < elements; j++) {
                listIntegers.add(sc.nextInt());
            }
            listListElements.add(listIntegers);
        }

        n = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> listListPositions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> listPosition = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                listPosition.add(sc.nextInt() - 1);
            }
            listListPositions.add(listPosition);
        }

        sc.close();

        listListPositions.forEach(x -> {
            try {
                System.out.println(listListElements.get(x.get(0)).get(x.get(1)));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        });
    }
}