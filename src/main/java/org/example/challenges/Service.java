package org.example.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Service {

    HashMap<String, Boolean> letrasAlfabetoUsadas = new HashMap<>();

    public Service() {
        letrasAlfabetoUsadas.put("a", false);
        letrasAlfabetoUsadas.put("b", false);
        letrasAlfabetoUsadas.put("c", false);
        letrasAlfabetoUsadas.put("d", false);
        letrasAlfabetoUsadas.put("e", false);
        letrasAlfabetoUsadas.put("f", false);
        letrasAlfabetoUsadas.put("g", false);
        letrasAlfabetoUsadas.put("h", false);
        letrasAlfabetoUsadas.put("i", false);
        letrasAlfabetoUsadas.put("j", false);
        letrasAlfabetoUsadas.put("k", false);
        letrasAlfabetoUsadas.put("l", false);
        letrasAlfabetoUsadas.put("m", false);
        letrasAlfabetoUsadas.put("n", false);
        letrasAlfabetoUsadas.put("o", false);
        letrasAlfabetoUsadas.put("p", false);
        letrasAlfabetoUsadas.put("q", false);
        letrasAlfabetoUsadas.put("r", false);
        letrasAlfabetoUsadas.put("s", false);
        letrasAlfabetoUsadas.put("t", false);
        letrasAlfabetoUsadas.put("u", false);
        letrasAlfabetoUsadas.put("v", false);
        letrasAlfabetoUsadas.put("w", false);
        letrasAlfabetoUsadas.put("x", false);
        letrasAlfabetoUsadas.put("y", false);
        letrasAlfabetoUsadas.put("z", false);
    }

    public void pangramChallenge() {

        String[] opa = {"yymhl", "lwfkt", "vrsri", "erxea", "eefrr", "nimic", "wldqy", "wrfea", "ecjoz", "gaaxx", "xoemv", "ypomt", "ienjv", "zahlx", "vgtvk", "sknnc", "kugie", "tqqie", "elney", "kaeoz"};

        ArrayList<String> strings = new ArrayList<>(Arrays.asList(opa));

        isPangram(strings);
    }

    public void twoDArray() {

        int biggestHourGlass = 0;

        List<List<Integer>> arr = List.of(
                List.of(-1, -1, 0, -9, -2, -2),
                List.of(-2, -1, -6, -8, -2, -5),
                List.of(-1, -1, -1, -2, -3, -4),
                List.of(-1, -9, -2, -4, -4, -5),
                List.of(-7, -3, -3, -2, -9, -9),
                List.of(-1, -3, -1, -2, -4, -5));

        for (int a = 0; a < 6; a++) {
            if (6 - a < 3) {
                continue;
            }

            int o = 3 + a > 6 ? 6 : 3 + a;
            int xMiddleHourGlassIndex = a + 1;

            for (int b = 0; b < 6; b++) {
                if (6 - b < 3) {
                    continue;
                }

                int hourGlass = 0;
                int p = 3 + b > 6 ? 6 : 3 + b;
                int yMiddleHourGlassIndex = b + 1;

                for (int i = 0 + a; i < o; i++) {
                    for (int j = 0 + b; j < p; j++) {
                        Integer number = arr.get(i).get(j);

                        if (i == xMiddleHourGlassIndex) {
                            if (j == yMiddleHourGlassIndex) {
                                hourGlass += number;
                            }
                        } else {
                            hourGlass += number;
                        }
                    }
                }
                if (hourGlass > biggestHourGlass) {
                    biggestHourGlass = hourGlass;
                }
            }
        }

        System.out.println("fim");
    }


    private int isPangram(ArrayList<String> strings) {

        List<Character> result =
                strings.stream()
                        .flatMapToInt(String::chars)
                        .mapToObj(i -> (char) i)
                        .collect(toList());

        result.forEach(x -> letrasAlfabetoUsadas.put(String.valueOf(x.charValue()), true));


        if (letrasAlfabetoUsadas.containsValue(false))
            return 0;

        return 1;

    }
}


