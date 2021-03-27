package structures.trees;

public class BinaryTree {
    private Node root;

    public void insert(int key, int data) {
        Node node = new Node(key, data);
        if(root == null){
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if(key<current.key){
                    current  = current.leftChild;
                    if(current == null){
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }
}
