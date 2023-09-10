package SearchingAlgorithms;

public class Main {
    public static void main(String[] args) {
        var search = new ExponentialSearch();
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(search.search(items, 5));
    }
}
