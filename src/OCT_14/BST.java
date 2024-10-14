package OCT_14;

public class BST {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Searching for 40: " + tree.search(40));
        System.out.println("Searching for 100: " + tree.search(100));

        tree.delete(20);
        tree.delete(30);
        tree.delete(50);
    }

    Node root;
    public void insert(int val) {
        root = insertRec(root, val);
    }

    private Node insertRec(Node root, int val) {
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val){
            root.left = insertRec(root.left, val);
        }
        else if(val > root.val){
            root.right = insertRec(root.right, val);
        }
        return root;
    }
    public boolean search(int val){
        return searchRec(root, val);
    }
    private boolean searchRec(Node root, int val) {
        if(root == null){
            return false;
        }
        if(root.val == val){
            return true;
        }
        return val < root.val ? searchRec(root.left, val):searchRec(root.right, val);
    }
    public void delete(int val) {
        root = deleteRec(root, val);
    }

    private Node deleteRec(Node root, int val) {
        if(root == null){
            return null;
        }
        if(val < root.val){
            root.left = deleteRec(root.left, val);
        }
        else if(val > root.val){
            root.right = deleteRec(root.right, val);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.val = minValue(root.right);
            root.right = deleteRec(root.right, root.val);
        }
        return root;
    }

    private int minValue(Node root) {
        int minv = root.val;
        while(root.left != null){
            root = root.left;
            minv = root.val;
        }
        return minv;
    }
}

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}
