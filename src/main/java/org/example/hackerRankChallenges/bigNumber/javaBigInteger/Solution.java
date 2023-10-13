package org.example.hackerRankChallenges.bigNumber.javaBigInteger;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal n1 = scanner.nextBigDecimal();
        BigDecimal n2 = scanner.nextBigDecimal();

        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));

        scanner.close();
    }
}
