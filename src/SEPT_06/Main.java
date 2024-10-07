package SEPT_06;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(6);
        list.display();
        list.insertLast(15);
        list.display();
        list.insert(10,4);
        list.display();
        list.delete(4);
        list.deleteLast();
        list.deleteFirst();
        list.display();
    }
}
