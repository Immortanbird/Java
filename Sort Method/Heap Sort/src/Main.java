import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 38, 13, 11, 10, 4, 5, 0};
        Heap.heapsort_asc(arr);
        System.out.println(Arrays.toString(arr));
    }
}
