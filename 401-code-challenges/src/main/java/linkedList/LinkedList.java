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

    public Node head;

    public void insert(int value) {
        head = new Node(value, this.head);
    }

    public boolean includes(int value) {
        Node currentNode = head;

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

        Node currentNode = head;

        while (currentNode != null) {
            printList.add(currentNode.value);
            currentNode = currentNode.next;
        }

        return printList;
    }

    public void append(int value) {
        Node newNode = new Node(value, null);

        if (head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertBefore(int target, int value) {
        Node currentNode = head;

        if (head.value == target) {
            this.insert(value);
            return;
        }
        while (currentNode.next != null) {
            if (currentNode.next.value == target) {
                Node newNode = new Node(value, currentNode.next);
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void insertAfter(int target, int value) {
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.value == target) {
                Node newNode = new Node(value, currentNode.next);
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public int kthFromEnd(int k) {
        if (k < 0) {
            throw new IllegalArgumentException("k cannot be a negative integer");
        }
        int size = 0;
        Node currentNode = head;

        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        int deltaK = size - k - 1;

        if (deltaK < 0) {
            throw new IllegalArgumentException("k exceeds the size of linked list");
//        } else if (deltaK == 0) {
//            return head.value;
        } else {
            currentNode = head;
            for (int i = 0 ; i < deltaK ; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.value;
        }


    }




}
