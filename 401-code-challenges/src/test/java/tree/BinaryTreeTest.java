package tree;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    private BinaryTree myTree = new BinaryTree();
    BinaryTree init = new BinaryTree();

    @Before
    public void initTree() {
       myTree.root = new TreeNode(5);
       myTree.root.setLeftChild(new TreeNode(1) );
       myTree.root.setRightChild(new TreeNode(6));
       myTree.root.getLeftChild().setRightChild(new TreeNode(3));
    }

    @Test
    public void testPreOrder() {
        String expectedOutput = "[5, 1, 3, 6]";

        assertEquals("The method should return an array that when stringified matches the above string.",
                expectedOutput,
                myTree.preOrder(myTree).toString());
    }

    @Test
    public void testPostOrder() {
        String expectedOutput = "[3, 1, 6, 5]";

        assertEquals("The method should return an array that when stringified matches the above string.",
                expectedOutput,
                myTree.postOrder(myTree.root).toString());
    }

    @Test
    public void testInOrder() {
        String expectedOutput = "[1, 3, 5, 6]";

        assertEquals("The method should return an array that when stringified matches the above string.",
                expectedOutput,
                myTree.inOrder(myTree.root).toString());
    }

    @Test
    public void testBreadthFirst() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        myTree.breadthFirst();

        //expected: 5,1,6,3
        assertEquals("5\n1\n6\n3\n", outContent.toString());
    }
}