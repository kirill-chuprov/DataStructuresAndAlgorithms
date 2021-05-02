import structures.hashmap.HashTable;
import structures.hashmap.Link;
import structures.trees.BinaryTree;

public class Runner {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.insert(new Link(200));
        hashTable.insert(new Link(2));
    }
}
