package org.example.hackerRankChallenges.strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class JavaAnagrams {
    private HashMap<Character, Integer> lettersAOcurred = new HashMap<>() {{
        put('A', 0);
        put('B', 0);
        put('C', 0);
        put('D', 0);
        put('E', 0);
        put('F', 0);
        put('G', 0);
        put('H', 0);
        put('I', 0);
        put('J', 0);
        put('K', 0);
        put('L', 0);
        put('M', 0);
        put('N', 0);
        put('O', 0);
        put('P', 0);
        put('Q', 0);
        put('R', 0);
        put('S', 0);
        put('T', 0);
        put('U', 0);
        put('V', 0);
        put('W', 0);
        put('X', 0);
        put('Y', 0);
        put('Z', 0);
    }};

    private HashMap<Character, Integer> lettersBOcurred = new HashMap<>() {{
        put('A', 0);
        put('B', 0);
        put('C', 0);
        put('D', 0);
        put('E', 0);
        put('F', 0);
        put('G', 0);
        put('H', 0);
        put('I', 0);
        put('J', 0);
        put('K', 0);
        put('L', 0);
        put('M', 0);
        put('N', 0);
        put('O', 0);
        put('P', 0);
        put('Q', 0);
        put('R', 0);
        put('S', 0);
        put('T', 0);
        put('U', 0);
        put('V', 0);
        put('W', 0);
        put('X', 0);
        put('Y', 0);
        put('Z', 0);
    }};
    public boolean isAnagram(String a, String b) {
        AtomicBoolean isAnagram = new AtomicBoolean(true);

        "ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars().mapToObj(x -> (char) x).forEach(x -> {
            if (!lettersAOcurred.get(x).equals(lettersBOcurred.get(x))) {
                isAnagram.set(false);
            }
        });

        return isAnagram.get();
    }

    public void doTheChallenge() {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        fillAOccured(a);
        fillBOccured(b);
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private void fillAOccured(String a) {
        a.chars().mapToObj(x -> (char) x).forEach(x -> lettersAOcurred.put(Character.toUpperCase(x.charValue()), lettersAOcurred.get(Character.toUpperCase(x.charValue()))+1));
    }
    private void fillBOccured(String b) {
        b.chars().mapToObj(x -> (char) x).forEach(x -> lettersBOcurred.put(Character.toUpperCase(x.charValue()), lettersBOcurred.get(Character.toUpperCase(x.charValue()))+1));
    }

}
