package fizzbuzztree;

import org.junit.Before;
import org.junit.Test;
import tree.BinaryTree;
import tree.TreeNode;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    private BinaryTree<String> myTree = new BinaryTree<>();
    BinaryTree init = new BinaryTree();

    @Before
    public void initTree() {
        myTree.root = new TreeNode<>("30");
        myTree.root.setLeftChild(new TreeNode<>("1") );
        myTree.root.setRightChild(new TreeNode<>("6"));
        myTree.root.getLeftChild().setRightChild(new TreeNode<>("3"));


    }

    @Test
    public void testFizzBuzz() {
        FizzBuzzTree initFizz = new FizzBuzzTree();

        String expectedOutput = "[1, Fizz, FizzBuzz, Fizz]";

        assertEquals("The fizzBuzz-modified tree, when printed using the inOrder method, should return the above string.",
                expectedOutput,
                init.inOrder(initFizz.fizzBuzz(myTree).root).toString());
    }

    // Given more time, I would finish refactoring the rest of my old code to accept generic inputs. With this, I would also
    // implement stronger error detection and handling, and include tests for cases where the inputs are not all stringified
    // numbers.
}