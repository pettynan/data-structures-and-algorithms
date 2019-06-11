package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    private PseudoQueue pseudoQueue;

    @Before
    public void pseudoQueueInit() {
        pseudoQueue = new PseudoQueue();
    }

    @Test
    public void testEnqueue() {
        pseudoQueue.enqueue(4);

        assertEquals("The front of the queue, when peeked, should equal the enqueued value of 4.",
                4,
                pseudoQueue.peek());
    }

    @Test
    public void testEnqueue_multi() {
        pseudoQueue.enqueue(4);
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(6);

        assertEquals("The front of the queue, when peeked, should equal the earliest enqueued value of 4.",
                4,
                pseudoQueue.peek());
    }

    @Test
    public void testDequeue_returnVal() {
        pseudoQueue.enqueue(4);
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(6);
        pseudoQueue.dequeue();

        assertEquals("The dequeue method should return the front of the queue, which at this point equals 5.",
                5,
                pseudoQueue.dequeue());
    }

    @Test
    public void testPeek() {
        pseudoQueue.enqueue(4);
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(6);

        assertEquals("The front of the queue, when peeked, should equal the earliest enqueued value of 4.",
                4,
                pseudoQueue.peek());
    }

    @Test(expected = NullPointerException.class)
    public void testDequeue_multi() {
        pseudoQueue.enqueue(4);
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(6);
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();

        pseudoQueue.peek();
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyQueue() {
        pseudoQueue.peek();
    }
}