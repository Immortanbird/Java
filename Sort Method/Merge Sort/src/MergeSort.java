/*
* An example of merge sort(ascending).
* */

public class MergeSort {
    public static void sort(int[] nums) {
        int[] temp = new int[nums.length];
        sort(nums, 0, nums.length - 1, temp);
    }

    private static void sort(int[] nums, int left, int right, int[] temp) {
        if (left >= right)
            return;

        int mid = (left + right) / 2;
        sort(nums, left, mid, temp);
        sort(nums, mid + 1, right, temp);

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j<= right) {
            if (nums[i] < nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }

        while (i <= mid)
            temp[k++] = nums[i++];

        while (j <= right)
            temp[k++] = nums[j++];

        for (i=left; i <= right; i++)
            nums[i] = temp[i];
    }
}
