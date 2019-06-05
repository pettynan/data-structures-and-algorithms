package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testInsert() {
        LinkedList initForTest = new LinkedList();

        initForTest.insert(8);
        assertEquals("the header node should have a value of 8",
                8,
                initForTest.head.value);

    }

    @Test
    public void testIncludes() {
        LinkedList initForTest = new LinkedList();

        for (int i = 1 ; i < 10 ; i++) {
            initForTest.insert(i);
        }

        assertTrue("The includes method should find the number 7 in the list, and return true",
                initForTest.includes(7));
    }

    @Test
    public void testIncludes_not() {
        LinkedList initForTest = new LinkedList();

        for (int i = 1 ; i < 10 ; i++) {
            initForTest.insert(i);
        }

        assertFalse("The includes method should fail to find the number 17 in the list, and return false",
                initForTest.includes(17));
    }

    @Test
    public void testPrint() {
        LinkedList initForTest = new LinkedList();

        System.out.println(initForTest.print());

        for (int i = 0 ; i < 10 ; i++) {
            initForTest.insert(i);
        }

        String expectedString = "[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]";
        String outputString = initForTest.print().toString();

        assertEquals("The method should print an ArrayList equivalent to the above array.",
                expectedString,
                outputString
        );

    }

    @Test
    public void testPrint_empty() {
        LinkedList initForTest = new LinkedList();

        String expectedString = "[]";
        String outputString = initForTest.print().toString();

        assertEquals("The method should an empty array for an empty LL, []",
                expectedString,
                outputString
        );

    }

    // Other tests I would want to write if I spent more time:
    // handling for bad input values to all 3 functions
    // testing when the same value is inserted multiple times

    @Test
    public void testAppends() {
        LinkedList init = new LinkedList();

        init.insert(5);
        init.insert(1);
        init.insert(4);
        init.insert(8);
        init.insert(6);
        init.insert(4);
        init.insert(2);
        init.insert(3);

        init.append(10);

        String expectedString = "[3, 2, 4, 6, 8, 4, 1, 5, 10]";
        String outputString = init.print().toString();

        assertEquals("The method should print an ArrayList equivalent to the above array.",
                expectedString,
                outputString
        );
    }

    @Test
    public void testInsertBefore() {
        LinkedList init = new LinkedList();

        init.insert(5);
        init.insert(1);
        init.insert(4);
        init.insert(8);
        init.insert(6);
        init.insert(2);
        init.insert(3);

        init.insertBefore(8, 10);

        String expectedString = "[3, 2, 6, 10, 8, 4, 1, 5]";
        String outputString = init.print().toString();

        assertEquals("The method should print an ArrayList equivalent to the above array.",
                expectedString,
                outputString
        );

    }

    @Test
    public void testInsertAfter() {
        LinkedList init = new LinkedList();

        init.insert(5);
        init.insert(1);
        init.insert(4);
        init.insert(8);
        init.insert(6);
        init.insert(2);
        init.insert(3);

        init.insertAfter(8, 10);

        String expectedString = "[3, 2, 6, 8, 10, 4, 1, 5]";
        String outputString = init.print().toString();

        assertEquals("The method should print an ArrayList equivalent to the above array.",
                expectedString,
                outputString
        );
    }
    // Given more time I would test:
    // - Response when target value is not found in LL
    // - Behavior when target value is the first or last value in LL
    // - Behavior of append when LL is empty

    @Test
    public void testKthFromEnd() {
        LinkedList init = new LinkedList();

        init.insert(5);
        init.insert(1);
        init.insert(4);
        init.insert(8);
        init.insert(6);
        init.insert(2);
        init.insert(3);

        assertEquals("The method should find the 3rd value from the end, and return 8",
                8,
                init.kthFromEnd(3)
        );
    }

    @Test (expected = IllegalArgumentException.class)
    public void testKthFromEnd_sizeEqualsK() {
        LinkedList init = new LinkedList();

        init.insert(5);
        init.insert(1);
        init.insert(4);
        init.insert(8);
        init.insert(6);
        init.insert(2);
        init.insert(3);

        init.kthFromEnd(7);
        System.out.print("The method should fail to find the 7th node from the end, and return an illegal arg exception.");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testKthFromEnd_sizeLessThanK() {
        LinkedList init = new LinkedList();

        init.insert(5);
        init.insert(1);
        init.insert(4);
        init.insert(8);
        init.insert(6);
        init.insert(2);
        init.insert(3);

        init.kthFromEnd(10);
        System.out.print("The method should fail to find the 10th node from the end, and return an illegal arg exception.");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testKthFromEnd_kIsNegative() {
        LinkedList init = new LinkedList();

        init.insert(5);
        init.insert(1);
        init.insert(4);
        init.insert(8);
        init.insert(6);
        init.insert(2);
        init.insert(3);

        assertEquals("The method should detect a negative input, and return an illegal arg exception.",
                8,
                init.kthFromEnd(-3)
        );
    }

    @Test
    public void testKthFromEnd_sizeOfLLis1() {
        LinkedList init = new LinkedList();

        init.insert(5);

        assertEquals("The method should find the node that is 0 steps from the end, and return its value of 5.",
                5,
                init.kthFromEnd(0)
        );
    }
}