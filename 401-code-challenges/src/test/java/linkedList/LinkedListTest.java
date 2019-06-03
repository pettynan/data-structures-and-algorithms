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

        for (int i = 1 ; i < 10 ; i++) {
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

        String expectedString = "[0]";
        String outputString = initForTest.print().toString();

        assertEquals("The method should print the default empty node, [0]",
                expectedString,
                outputString
        );

    }

    // Other tests I would want to write if I spent more time:
    // handling for bad input values to all 3 functions
    // testing when the same value is inserted multiple times
}