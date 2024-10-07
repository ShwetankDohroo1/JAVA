package SEPT_07;

import SEPT_06.LL;

public class DLL {
    private Node head;
    private int size;
    public DLL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        size += 1;
    }
    public void insertLast(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            size++;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        node.prev = temp;
        size += 1;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index+1 == size){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        temp.next = node;
        node = temp.next.next;
        node.prev = temp;
        node.next.prev = node;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.println(node.value + "->");
            node = node.next;
        }
        System.out.println("end");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
