package SortAlgorithms;

public class BubbleSort {

    public void sort(int[] array) {
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    isSorted = false;
                }
            }
            if (isSorted)
                return;
        }
    }

    private void swap(int[] items, int left, int right) {
        var temp = items[left];
        items[left] = items[right];
        items[right] = temp;
    }
}
