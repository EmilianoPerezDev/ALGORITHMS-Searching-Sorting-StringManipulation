package SortAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 7, 1, 3, 5, 3 };
        var sorter = new BucketSort();
        sorter.sort(numbers, 3);
        System.out.println(Arrays.toString(numbers));
    }
}