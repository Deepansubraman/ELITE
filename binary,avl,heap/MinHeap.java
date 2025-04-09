import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1];
    }

    private int parent(int index) { return index / 2; }
    private int leftChild(int index) { return 2 * index; }
    private int rightChild(int index) { return 2 * index + 1; }

    public void insert(int value) {
        if (size >= capacity) {
            System.out.println("Heap is full. Cannot insert.");
            return;
        }

        size++;
        heap[size] = value;
        int current = size;

        // Bubble up (min-heap: smaller values move up)
        while (current > 1 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int deleteMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int min = heap[1];
        heap[1] = heap[size];
        size--;
        heapify(1);

        return min;
    }

    private void heapify(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left <= size && heap[left] < heap[smallest])
            smallest = left;

        if (right <= size && heap[right] < heap[smallest])
            smallest = right;

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        System.out.print("Heap: ");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(50);
        minHeap.insert(30);
        minHeap.insert(20);
        minHeap.insert(15);
        minHeap.insert(8);
        minHeap.insert(60);

        minHeap.printHeap();

        System.out.println("Deleted min: " + minHeap.deleteMin());
        minHeap.printHeap();
    }
}
