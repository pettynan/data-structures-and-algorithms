package stacksandqueues;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public Node getFront() {
        return this.front;
    }

    public Node getRear() {
        return this.rear;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value, null);
        if (this.front == null) {
            this.front = newNode;
        } else {
            this.rear.next = newNode;
        }
        this.rear = newNode;
    }

    public int dequeue() {
        int returnValue = this.front.value;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return returnValue;
    }

    public int peek() {
        return this.front.value;
    }
}
