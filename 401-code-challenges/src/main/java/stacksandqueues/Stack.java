package stacksandqueues;

public class Stack {
    private Node top;

    public Stack() { this.top = null; }

    public Node getTop() {
        return this.top;
    }

    public void push(int value) {
        this.top = new Node(value, this.top);

    }

    public int pop() {
        int returnValue = this.top.value;
        this.top = this.top.next;
        return returnValue;
    }

    public int peek() {
        return this.top.value;
    }





}
