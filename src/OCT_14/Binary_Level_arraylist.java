package OCT_14;

import java.util.ArrayList;
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }

    @Override
    public String toString() {
        return val + "";
    }
}
public class Binary_Level_arraylist {
    public ArrayList<Integer> levelOrder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        ArrayList<TreeNode> parent = new ArrayList<>();
        parent.add(root);
        while(!parent.isEmpty()){
            System.out.println(parent);
            ArrayList<TreeNode> child = new ArrayList<>();
            for(TreeNode i:parent){
                result.add(i.val);
                if(i.left != null){
                    child.add(i.left);
                }
                if(i.right != null){
                    child.add(i.right);
                }
            }
            parent = child;
        }
        return result;
    }

    public static void main(String[] args) {
        Binary_Level_arraylist tree = new Binary_Level_arraylist();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList<Integer> traversalResult = tree.levelOrder(root);
    }
}
