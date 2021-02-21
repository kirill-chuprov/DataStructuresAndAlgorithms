package algoritms;

public class ArraySorting {
    int elements;
    int[] array;

    public ArraySorting(int arraySize) {
        this.array = new int[arraySize];
        this.elements = 0;
    }

    public void insert(int value) {
        this.array[elements] = value;
        elements++;
    }

    public int[] getArray() {
        return array;
    }

    public int[] bubbleSort() {
        for (int out = elements - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (this.array[in] > this.array[in + 1]) {
                    int temp = this.array[in];
                    this.array[in] = this.array[in + 1];
                    this.array[in + 1] = temp;
                }
            }
        }
        return this.array;
    }

    public int[] selectionSort() {
        for (int out = 0; out < elements - 1; out++) {
            for (int in = out + 1; in < elements; in++) {
                if (this.array[in] < this.array[out]) {
                    int temp = this.array[out];
                    this.array[out] = this.array[in];
                    this.array[in] = temp;
                }
            }
        }
        return this.array;
    }
    
    public int[] insertionSort() {
        for (int out = 1; out < elements; out++) {
            int temp = this.array[out];
            int in = out;
            while (in > 0 && this.array[in - 1] >= temp) {
                this.array[in] = this.array[in - 1];
                in--;
            }
            this.array[in] = temp;
        }
        return this.array;
    }


}
