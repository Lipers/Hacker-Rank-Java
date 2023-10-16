package org.example.hackerRankChallenges.dataStructures.javaArrayPart2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, n)) ? "YES" : "NO");
        }
        scan.close();
    }

    public static boolean canWin(int leap, int[] game, int n) {

        int i = 0;
        while (true) {
            if (won(i, n)) {
                return true;
            }
            try {
                if (game[i + leap] == 0) {
                    i += leap;
                    continue;
                } else if (game[i + 1] == 0) {
                    i++;
                    continue;
                }
                boolean gotBackAndJumped = false;
                if (i > 0 && game[i - 1] == 0) {
                    for (int j = 1; j < leap; j++) {
                        if (i > 0 && game[i - 1] == 0) {
                            i--;
                            if (game[i + leap] == 0) {
                                i += leap;
                                gotBackAndJumped = true;
                                break;
                            }
                        }
                    }
                }
                if (!gotBackAndJumped)
                    return false;
            } catch (Exception e) {
                return true;
            }
        }
    }

    private static boolean won(int i, int n) {
        return n - 1 == i;
    }

}
