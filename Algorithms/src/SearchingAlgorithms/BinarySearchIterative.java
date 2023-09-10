package SearchingAlgorithms;

public class BinarySearchIterative {
    public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            var middle = (left + right) / 2;

            if (target == array[middle])
                return middle;

            if (target > array[middle])
                left = middle + 1;
            else
                right = middle - 1;
        }

        return -1;
    }
}
