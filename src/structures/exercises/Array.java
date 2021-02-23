package structures.exercises;

public class Array {
    int size;
    int numberOfElements;
    int[] array;

    public Array(int size) {
        this.array = new int[size];
        this.size = size;
    }

    public void push(int value) {
        if (size == numberOfElements) {
            resizeIfNeeded();
        }
        this.array[numberOfElements] = value;
        numberOfElements++;
    }

    public void prepend(int value) {
        resizeIfNeeded();
        for (int i = numberOfElements; i >= 0; i--) {
            this.array[i + 1] = this.array[i];
        }
        this.array[0] = value;
        numberOfElements++;
    }

    public int pop() {
        return this.array[numberOfElements--];
    }

    public void insertAtIndex(int index, int value) {
        resizeIfNeeded();
        for (int k = numberOfElements; k >= index; k--) {
            this.array[k + 1] = this.array[k];
        }
        this.array[index] = value;
        numberOfElements++;
    }

    public void deleteAtIndex(int index) {
        //Note should ne numberOfElements - 1 because we are dealing with indexes here
        for (int i = index; i < size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        numberOfElements--;
    }

    public void remove(int value) {
        for (int i = 0; i < numberOfElements; i++) {
            if (this.array[i] == value) {
                for (int j = i; j < numberOfElements - 1; j++) {
                    this.array[j] = this.array[j + 1];
                }
                numberOfElements--;
                return;
            }
        }
    }

    public int find(int value) {
        int returnValue = -1;
        for (int i = 0; i < numberOfElements - 1; i++) {
            if (array[i] == value) {
                returnValue = value;
                break;
            }
        }
        return returnValue;
    }

    public int getNumberOfElements() {
        return size;
    }

    public int getAtPosition(int index) {
        if (index > size) throw new ArrayIndexOutOfBoundsException("Out of array bounds");
        return this.array[index];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private void resizeIfNeeded() {
        if (size == numberOfElements) {
            int newArraySize = size * 2;
            int[] newArray = new int[newArraySize];
            for (int i = 0; i < numberOfElements; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
    }
}
