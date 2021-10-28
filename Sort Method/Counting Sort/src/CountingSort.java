/*
* Counting sort
* Assuming that all integers in array "nums" are smaller than or equals to k, we may sort the array by counting the number of numbers smaller than i (0<=i<=k) to determine the position of i.
* The method needs additional space of k+nums.length+1.
* */

public class CountingSort {
    public static int[] countingSort(int[] nums, int k) {
        int[] res = new int[nums.length];
        int[] count = new int[k + 1];

        for (int x : nums)
            count[x]++;

        for (int i=1; i<=k; i++)
            count[i] += count[i-1];

        for (int x : nums) {
            res[count[x] - 1] = x;
            count[x] -= 1;  //in case that the repeated numbers won't be set at the same position
        }

        return res;
    }
}
