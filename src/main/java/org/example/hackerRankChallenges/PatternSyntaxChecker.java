package org.example.hackerRankChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {

    public void doTheChallenge() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stringList.add(scanner.nextLine());
        }

        for (String pattern: stringList) {
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }

    }
}
