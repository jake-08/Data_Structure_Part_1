package searching;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 7, 8};
        var search = new Search();
        var index = search.exponentialSearch(numbers, 7);
        System.out.println(index);
    }
}
