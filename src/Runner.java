import algoritms.ArrayWithSortingFeatures;
import structures.trees.BinaryTree;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10,10);
        binaryTree.insert(2,2);
        binaryTree.insert(30,30);
        binaryTree.insert(3,3);
        binaryTree.insert(1,1);
        binaryTree.displayTree();
        binaryTree.delete(2);
        binaryTree.displayTree();
    }
}
