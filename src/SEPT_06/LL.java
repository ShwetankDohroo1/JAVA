package SEPT_06;

import java.util.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    //insert at head
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    //insert at last of LL
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp=head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
        size += 1;
    }
    //insert at between of LL
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index+1 == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size+=1;
    }
    //delete a node from head
    public void deleteFirst(){
        if(head == null){
            tail = null;
        }
        head = head.next;
        size -=1;
    }
    // delete a node from last of LL
    public void deleteLast(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size -=1;
    }
    //delete a node from between
    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size){
            deleteLast();
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size -=1;
    }
    //get the value of node by index
    public Node get(int index){
        Node temp = head;
        for (int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    //display all the nodes
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    //find node with value
    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;

        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
