package structures.queue;

public class QueueBasedOnArray {
    int front;
    int rear;
    int items;
    int maxSize;
    int[] array;

    public QueueBasedOnArray(int size) {
        maxSize = size;
        array = new int[size];
        front = 0;
        rear = -1;
        items = 0;
    }

    public void push(int data) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        array[rear] = data;
        items++;
    }

    public int removeFront() {
        int temp = array[front];
        front++;
        if (front == maxSize)
            front = 0;
        items--;
        return temp;
    }
}

