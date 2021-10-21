/*
 * 堆操作
 * */

public class Heap {
    public static void buildMaxHeap(int[] nums) {
        for (int i = nums.length / 2 - 1; i>=0; i--)
            maxHeapify(nums, i);
    }

    public static void buildMinHeap(int[] nums) {
        for (int i = nums.length / 2 - 1; i>=0; i--)
            minHeapify(nums, i);
    }

    public static void maxHeapify(int[] heap, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        int largest = index;

        if (left < heap.length)
            largest = heap[left] > heap[largest] ? left : largest;
        if (right < heap.length)
            largest = heap[right] > heap[largest] ? right : largest;

        if (largest != index) {
            int temp = heap[largest];
            heap[largest] = heap[index];
            heap[index] = temp;
            maxHeapify(heap, largest);
        }
    }

    public static void minHeapify(int[] heap, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        int smallest = index;

        if (left < heap.length)
            smallest = heap[left] < heap[smallest] ? left : smallest;
        if (right < heap.length)
            smallest = heap[right] < heap[smallest] ? right : smallest;

        if (smallest != index) {
            int temp = heap[smallest];
            heap[smallest] = heap[index];
            heap[index] = temp;
            minHeapify(heap, smallest);
        }
    }
}
