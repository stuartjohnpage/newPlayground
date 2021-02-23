package binaryTree;

public class BinaryTree {
    Node root;

    public Node insertNode(Node current, int key) {

        if (current == null) {
            return new Node(key);
        } else if (key < current.getKey()) {
            current.setLeftNode(insertNode(current.getLeftNode(), key));
        } else if (key > current.getKey()) {
            current.setRightNode(insertNode(current.getRightNode(), key));
        } else {
            return current;
        }

        return current;
    }

    public void add(int key) {
        root = insertNode(root, key);
    }


    @Override
    public String toString() {
        return "BinaryTree: \nroot=" + root;
    }


    public static void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeftNode());
            postOrder(node.getRightNode());
            System.out.print(node.getKey() + " ");
        }
    }
}

class Main {

    public static void main(String[] args) {

        BinaryTree myBinaryTree = new BinaryTree();

        int[] Nodes = {1,2,5,3,6,4};

        for (int n : Nodes) {
            myBinaryTree.add(n);
        }
        BinaryTree.postOrder(myBinaryTree.root);
    }

}

