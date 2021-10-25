/*
* Quicksort, ascending.
* */

public class QuickSort {
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static int partition(int[] nums, int start, int end) {
        int i = start + 1;
        int j = end;

        while (i <= j){
            if (nums[i] > nums[start])
                swap(nums, i, j--);
            else
                i++;
        }

        swap(nums, start, i - 1);

        return i - 1;
    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pivot = partition(nums, start, end);
            quickSort(nums, start, pivot - 1);
            quickSort(nums, pivot + 1, end);
        }
    }
}
