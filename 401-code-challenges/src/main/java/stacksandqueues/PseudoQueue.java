package stacksandqueues;

public class PseudoQueue<T> {
    private Stack<T> stackMain = new Stack<>();


    public void enqueue(T value) {

//        if (stackMain.top == null) {
//            stackMain.push(value);
//        } else {
            Stack<T> stackTemp = new Stack<>();

            while (stackMain.top != null) {
                stackTemp.push(stackMain.pop());
            }
            stackMain.push(value);
            while (stackTemp.top != null) {
                stackMain.push(stackTemp.pop());
            }
//        }
    }

    public T dequeue() {
        return stackMain.pop();
    }

    public T peek() {
        try {
            return stackMain.top.value;
        } catch (NullPointerException e) {
            System.out.println("Cannot call peek on empty PseudoQueue.");
            System.out.println(e);
            throw new NullPointerException("It done broke");
        }
    }

}
