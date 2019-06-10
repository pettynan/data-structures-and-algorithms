package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;

    @Before
    public void queueInit() {
        queue = new Queue();

    }

    @Test
    public void testEnqueue() {
        queue.enqueue(4);

        assertEquals("The front of the queue, when peeked, should equal the enqueued value of 4.",
                4,
                queue.peek());
    }

    @Test
    public void testEnqueue_multi() {
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        assertEquals("The front of the queue, when peeked, should equal the earliest enqueued value of 4.",
                4,
                queue.peek());
    }

    @Test
    public void testDequeue_returnVal() {
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.dequeue();

        assertEquals("The dequeue method should return the front of the queue, which at this point equals 5.",
                5,
                queue.dequeue());
    }

    @Test
    public void testPeek() {
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        assertEquals("The front of the queue, when peeked, should equal the earliest enqueued value of 4.",
                4,
                queue.peek());
    }

    @Test
    public void testDequeue_multi() {
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        assertNull("The front of the emptied queue should be null.",
                queue.getFront());
        assertNull("The rear of the emptied queue should be null.",
                queue.getRear());
    }

    @Test
    public void testEmptyQueue() {
        assertNull("The front of the instantiated empty queue should be null.",
                queue.getFront());
        assertNull("The rear of the instantiated empty queue should be null.",
                queue.getRear());

    }
}