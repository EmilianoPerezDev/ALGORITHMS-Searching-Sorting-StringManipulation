package SortAlgorithms;

public class InsertionSort {

    public void sort(int[] items) {
        for (int i = 1; i < items.length; i++) {
            var current = items[i];
            var j = i - 1;
            while (j >= 0 && items[j] > current) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = current;
        }
    }

}
