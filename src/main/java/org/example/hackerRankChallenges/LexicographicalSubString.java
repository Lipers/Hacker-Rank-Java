package org.example.hackerRankChallenges;

import java.util.Scanner;

public class LexicographicalSubString {

    public void doTheChallenge() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        largest = smallest = s.substring(0, k);
        for (int i = 0; i < s.length(); i++) {
            if (i+k > s.length()) {
                break;
            }
            String currentSubString = s.substring(i, k+i);
            if (largest.compareTo(currentSubString) < 0) {
                largest = currentSubString;
            }

            if (smallest.compareTo(currentSubString) > 0) {
                smallest = currentSubString;
            }
        }

        return smallest + "\n" + largest;
    }
}
