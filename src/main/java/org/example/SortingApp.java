package org.example;

import java.util.Arrays;

public class SortingApp {


    public static int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public static void main(String[] args) {
        if (args.length == 0 || args.length > 10) {
            System.out.println("Please provide between 1 and 10 integers as arguments.");
            return;
        }

        try {
            int[] numbers = Arrays.stream(args)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            numbers = sort(numbers);
            System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide integer values.");
        }
    }
}
