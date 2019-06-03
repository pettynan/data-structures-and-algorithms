package linkedList;

import java.util.ArrayList;

public class LinkedList {

    public class Node {

        int value;
        Node next;

        public Node (int value , Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public Node head = new Node(0, null);

    public void insert(int value) {
        head = new Node(value, this.head);
    }

    public boolean includes(int value) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public ArrayList<Integer> print() {
        ArrayList<Integer> printList = new ArrayList<>();

        Node currentNode = this.head;

        while (currentNode != null) {
            printList.add(currentNode.value);
            currentNode = currentNode.next;
        }

        return printList;
    }
}
