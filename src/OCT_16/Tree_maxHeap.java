package OCT_16;
public class Tree_maxHeap {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(90);
        tree.insert(30);
        tree.insert(20);
        tree.insert(15);
        tree.insert(0);
        tree.insert(7);
        tree.insert(5);
        tree.insert(6);

        // Print in-order traversal of the tree
        System.out.println("In-order traversal:");
        tree.inOrder();
        System.out.println();
        System.out.println(checking(tree.root));
    }
    public static boolean checking(Node root){
        if(root == null){
            return true;
        }
        if(root.left != null && root.left.data >= root.data){
            return false;
        }
        if(root.right != null && root.right.data >= root.data){
            return false;
        }
        return checking(root.left) && checking(root.right);
    }
}
class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    Node root;
    BinaryTree() {
        root = null;
    }
    void insert(int data) {
        root = insertRec(root, data);
    }
    Node insertRec(Node root, int data) {
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insertRec(root.left, data);
        } 
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        }

        return root;
    }
    void inOrder() {
        inOrderRec(root);
    }
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
}
