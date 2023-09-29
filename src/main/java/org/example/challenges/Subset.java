package org.example.challenges;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Subset {

    public void subSetArray() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = subsetA(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    private List<Integer> subsetA(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> subsetA = new ArrayList<>();
        do {
            subsetA.add(peekBiggestNumber(arr));
        } while (isSubSetALowerThanArray(subsetA, arr));
        Collections.sort(subsetA);
        return subsetA;
    }

    private boolean isSubSetALowerThanArray(List<Integer> subsetA, List<Integer> arr) {
        int sumOfSubsetA = subsetA.stream().mapToInt(Integer::intValue).sum();
        int sumOfArr = arr.stream().mapToInt(Integer::intValue).sum();
        return sumOfSubsetA < sumOfArr;
    }

    private Integer peekBiggestNumber(List<Integer> arr) {
        Integer lastIndexElement = arr.get(arr.size() - 1);
        int number = lastIndexElement;
        arr.remove(lastIndexElement);
        return number;
    }
}
