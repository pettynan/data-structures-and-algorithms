package stacksandqueues;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

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

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value, null);
        if (this.front == null) {
            this.front = newNode;
        } else {
            this.rear.next = newNode;
        }
        this.rear = newNode;
    }

    public T dequeue() {
        T returnValue = this.front.value;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return returnValue;
    }

    public T peek() {
        return this.front.value;
    }
}
