package SortAlgorithms;

public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            var indexOfMinimumItem = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[indexOfMinimumItem])
                    indexOfMinimumItem = j;
            swap(array, i, indexOfMinimumItem);
        }
    }

    private void swap(int[] array, int left, int right) {
        var temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
