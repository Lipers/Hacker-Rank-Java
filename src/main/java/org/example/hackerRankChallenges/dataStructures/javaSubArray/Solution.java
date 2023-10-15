package org.example.hackerRankChallenges.dataStructures.javaSubArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] values = sc.nextLine().split(" ");
        int numsOfNegativeArray = 0;
        for (int i = 0; i < n; i++) {
            boolean passedTheLastElement = false;
            for (int j = 0; j < n; j++) {
                if (passedTheLastElement) {
                    continue;
                }
                if (j+i+1 == n) {
                    passedTheLastElement = true;
                }
                int sum = sumArray(j, i, n, values);
                if (sum < 0) {
                    numsOfNegativeArray++;
                }
            }
        }
        System.out.println(numsOfNegativeArray);
    }

    private static int sumArray(int j, int i, int n, String[] values) {
        int sumOfArray = 0;
        int elementsPassed = 0;
        while (elementsPassed++ <= i && j < n) {
            sumOfArray += Integer.parseInt(values[j++]);
        }

        return sumOfArray;
    }
}
