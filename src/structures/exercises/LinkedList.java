package structures.exercises;

public class LinkedList {
    Node first;
    Node last;
    long size;

    public long size() {
        return size;
    }

    public boolean empty() {
        return first == null;
    }

    public void pushFront(int data) {
        Node node = new Node(data);
        if (first == null) {
            last = node;
        }
        node.next = first;
        first = node;
        Node current = first;
    }

    public void pushBack(int data) {
        Node node = new Node(data);
        if (first == null) {
            first = node;
        }
        if (last == null) {
            last = node;
            return;
        }
        last.next = node;
        last = node;

    }

    public void reverse() {
        Node previous = null;
        Node current = first;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
    }

    public void delete(int key) {
        Node current = first;
        Node previous = first;
        while (current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == first) {
            first = first.next;
        } else if (current == last) {
            last = previous;
        } else
            previous.next = current.next;
    }

    public void popBack() {
        if (first == null) {
            return;
        }
        if (first.next == null) {
            first = null;
        }
        Node current = first;
        while (current.next.next != null) {
            current = current.next;
            current.next = null;
        }
    }

    public void popFront() {
        if (first.next == null) {
            last = null;
        }
        first = first.next;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
