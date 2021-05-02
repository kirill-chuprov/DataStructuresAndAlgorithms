package structures.hashmap;

public class Link {
    private int data;
    public Link next;

    public Link(int it) {
        data = it;
    }

    public int getKey() {
        return data;
    }
}
