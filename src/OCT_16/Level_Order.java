package OCT_16;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static OCT_16.Tree_maxHeap.checking;

public class Level_Order {
    static Scanner sc=new Scanner(System.in);
    //making tree
    public static Node createTree(){
        int data=sc.nextInt();
        if (data==-1){
            return null;
        }
        Node root=new Node(data);

        System.out.println("Enter the left child: ");
        root.left=createTree();

        System.out.println("Enter the right child:");
        root.right=createTree();
        return root;
    }
    //inorder
    public static void inorder(Node node){
        if (node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data);
        System.out.print(" ");
        inorder(node.right);
    }
    //postorder
    public static void postorder(Node node){
        if (node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data);
        System.out.print(" ");
    }
    //preorder
    public static void preorder(Node node){
        if (node==null){
            return;
        }
        System.out.print(node.data);
        System.out.print(" ");
        preorder(node.left);
        preorder(node.right);
    }
    //levelOrder
    public static void levelOrder(Node node){
        if(node==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        q.add(null);
        while (!q.isEmpty()){
            Node out=q.poll();
            if (out==null){
                if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                }
            }
            else {
                System.out.print(out.data);
                System.out.print(" ");
                if (out.left != null) {
                    q.add(out.left);
                }
                if (out.right != null) {
                    q.add(out.right);
                }
            }
        }
    }
    public static void leftView(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        System.out.println(root.data);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr == null){
                if(!q.isEmpty()){
                    System.out.println(q.peek().data);
                    q.offer(null);
                }
            }
            else{
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void rightView(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        Node prev = null;
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr == null){
                System.out.println(prev.data);
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                prev = curr;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node a=createTree();
        inorder(a);
        System.out.println();
        levelOrder(a);
        System.out.println();
        System.out.println(checking(a));
        System.out.println();
        leftView(a);
        System.out.println();
        rightView(a);
    }
}