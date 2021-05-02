package structures.queue;

public class PriorityQueue {
    private int maxSize;
    private int[] array;
    private int elementsCount;

    public PriorityQueue(int size) {
        this.maxSize = size;
        this.array = new int[size];
        this.elementsCount = 0;
    }

    public int size() {
        return elementsCount;
    }

    public void insert(int element) {
        int j;
        if (elementsCount == 0) {
            this.array[elementsCount++] = element;
        } else {
            for (j = elementsCount - 1; j >= 0; j--) {
                if (element > this.array[j]) {
                    this.array[j + 1] = this.array[j];
                } else {
                    break;
                }
            }
            this.array[j + 1] = element;
            this.elementsCount++;
        }
    }

    public int getElement(int index) {
        return this.array[index];
    }
}
