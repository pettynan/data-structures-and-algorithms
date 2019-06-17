package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


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
                myTree.preOrder(myTree.root).toString());
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
}