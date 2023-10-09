package org.example.hackerRankChallenges.strings.validUsernameRegularExpression;

import java.util.Scanner;

public class Solution {

    class UsernameValidator {
        public static final String regularExpression = "^[a-zA-Z]([a-zA-Z0-9_]){7,29}";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
