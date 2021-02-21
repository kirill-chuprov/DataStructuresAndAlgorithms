import structures.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);

        linkedList.insertLast(4);
        linkedList.insertLast(5);
        linkedList.insertLast(6);
        linkedList.displayList();
    }
}
