/*
 * 堆操作
 * */

public class Heap {
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void heapsort_asc(int[] nums) {
        buildMaxHeap(nums);

        for (int i=nums.length - 1; i>0; i--) {
            swap(nums, i, 0);
            maxHeapify(nums, 0, i);
        }
    }

    public static void heapsort_des(int[] nums) {
        buildMinHeap(nums);

        for (int i=nums.length - 1; i>0; i--) {
            swap(nums, i, 0);
            minHeapify(nums, 0, i);
        }
    }

    public static void buildMaxHeap(int[] nums) {
        for (int i = nums.length / 2 - 1; i>=0; i--)
            maxHeapify(nums, i, nums.length);
    }

    public static void buildMinHeap(int[] nums) {
        for (int i = nums.length / 2 - 1; i>=0; i--)
            minHeapify(nums, i, nums.length);
    }

    public static void maxHeapify(int[] heap, int index, int length) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        int largest = index;

        if (left < length)
            largest = heap[left] > heap[largest] ? left : largest;
        if (right < length)
            largest = heap[right] > heap[largest] ? right : largest;

        if (largest != index) {
            swap(heap, index, largest);
            maxHeapify(heap, largest, length);
        }
    }

    public static void minHeapify(int[] heap, int index, int length) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        int smallest = index;

        if (left < length)
            smallest = heap[left] < heap[smallest] ? left : smallest;
        if (right < length)
            smallest = heap[right] < heap[smallest] ? right : smallest;

        if (smallest != index) {
            swap(heap, index, smallest);
            minHeapify(heap, smallest, length);
        }
    }
}
