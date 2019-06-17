package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree myBst;

    @Before
    public void initBST() {
        myBst = new BinarySearchTree();
    }

    @Test
    public void testAdd() {
        myBst.add(15);
        myBst.add(5);
        myBst.add(6);
        myBst.add(1);
        myBst.add(4);
        myBst.add(8);
        myBst.add(15);

        String expectedOutput = "[1, 4, 5, 6, 8, 15]";

        assertEquals("The inOrder method should return every item from the Binary Search Tree in numerical order.",
                expectedOutput,
                myBst.inOrder(myBst.root).toString());

    }

    @Test
    public void testContains() {
        myBst.add(15);
        myBst.add(5);
        myBst.add(6);
        myBst.add(1);
        myBst.add(4);
        myBst.add(8);

        assertTrue("Calling the contains method on the value '4' should return true.",
                myBst.contains(4));
    }

    @Test
    public void testContains_false() {
        myBst.add(15);
        myBst.add(5);
        myBst.add(6);
        myBst.add(1);
        myBst.add(4);
        myBst.add(8);

        assertFalse("Calling the contains method on the value '2' should return false.",
                myBst.contains(2));
    }

}