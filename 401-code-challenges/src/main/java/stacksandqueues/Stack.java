package stacksandqueues;

public class Stack<T> {
    Node<T> top;

    public Stack() { this.top = null; }

    public Node getTop() {
        return this.top;
    }

    public void push(T value) {
        this.top = new Node(value, this.top);

    }

    public T pop() {
        T returnValue = this.top.value;
        this.top = this.top.next;
        return returnValue;
    }

    public T peek() {
        return this.top.value;
    }





}
