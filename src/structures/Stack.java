package structures;

public class Stack {
    int top;
    int maxSize;
    int[] array;

    public Stack(int size) {
        maxSize = size;
        array = new int[size];
        top = -1;
    }

    public void push(int data) {
        array[++top] = data;
    }

    public int pop() {
        return array[top--];
    }
}
