package algoritms;

public class ArrayWithSortingFeatures {
    int elements;
    int[] array;

    public ArrayWithSortingFeatures(int arraySize) {
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

    public int[] mergeSort() {
        int[] workSpace = new int[elements];
        recMergeSort(workSpace, 0, elements - 1);
        return array;
    }

    public int[] shellSort() {
        int inner, outer;
        int temp;
        int h = 1;
        while (h <= elements / 3)
            h = h * 3 + 1;
        while (h > 0) {
            // h-сортировка файла
            for (outer = h; outer < elements; outer++) {
                temp = array[outer];
                inner = outer;
                // Первый подмассив (0, 4, 8)
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        return array;
    }

    private void recMergeSort(int[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound != upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            // Сортировка нижней половины
            recMergeSort(workSpace, lowerBound, mid);
            // Сортировка верхней половины
            recMergeSort(workSpace, mid + 1, upperBound);
            // Слияние
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;
        while (lowPtr <= mid && highPtr <= upperBound)
            if (array[lowPtr] < array[highPtr])
                workSpace[j++] = array[lowPtr++];
            else
                workSpace[j++] = array[highPtr++];
        while (lowPtr <= mid)
            workSpace[j++] = array[lowPtr++];
        while (highPtr <= upperBound)
            workSpace[j++] = array[highPtr++];
        for (j = 0; j < n; j++)
            array[lowerBound + j] = workSpace[j];
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
