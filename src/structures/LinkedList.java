package structures;

class Link {
    int data;
    Link next;

    public Link(int data) {
        this.data = data;
    }

    public void displayLink() {
        System.out.println("data" + data);
    }
}

public class LinkedList {
    Link first;
    Link last;

    public boolean isEmpty() {
        return first == null;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
            System.out.println("");
        }
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast (int data) {
        Link newLink = new Link(data);
        if (isEmpty()) {
            first = newLink;
        }
        last.next = newLink;
        last = newLink;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.data != key) {
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }

    public Link find(int key) {
        Link current = first;
        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link deleteFirst() {
        Link temp = first;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }
}
