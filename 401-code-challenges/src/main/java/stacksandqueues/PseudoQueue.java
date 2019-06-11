package stacksandqueues;

public class PseudoQueue {
    private Stack stackMain = new Stack();


    public void enqueue(int value) {

//        if (stackMain.top == null) {
//            stackMain.push(value);
//        } else {
            Stack stackTemp = new Stack();

            while (stackMain.top != null) {
                stackTemp.push(stackMain.pop());
            }
            stackMain.push(value);
            while (stackTemp.top != null) {
                stackMain.push(stackTemp.pop());
            }
//        }
    }

    public int dequeue() {
        return stackMain.pop();
    }

    public int peek() {
        try {
            return stackMain.top.value;
        } catch (NullPointerException e) {
            System.out.println("Cannot call peek on empty PseudoQueue.");
            System.out.println(e);
            throw new NullPointerException("It done broke");
        }
    }

}
