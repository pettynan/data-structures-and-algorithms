package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;

    @Before
    public void stackInit() {
    stack = new Stack();
    }

    @Test
    public void testPush() {
        stack.push(5);

        assertEquals("The top of the stack, when peeked, should equal the pushed value of 5.",
                5,
                stack.peek());
    }

    @Test
    public void testPush_multi() {
        stack.push(5);
        stack.push(7);
        stack.push(4);

        assertEquals("The top of the stack, when peeked, should equal the most recently pushed value of 4.",
                4,
                stack.peek());
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        assertEquals("The next value popped off the stack should equal 2.",
                2,
                stack.pop());
    }

    @Test
    public void testPop_multi() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();

        assertNull("The top of the emptied stack should be null.",
                stack.getTop());
    }

    @Test
    public void peek() {
        stack.push(5);
        stack.push(8);

        assertEquals("The peeked value should equal the value of the top of the stack, which is 8.",
                8,
                stack.peek());
    }

    @Test
    public void testEmptyStack() {
        assertNull("The top of the instantiated empty stack should be null.",
                stack.getTop());
    }
}