package treeintersection;

import org.junit.Before;
import org.junit.Test;
import tree.BinaryTree;
import tree.TreeNode;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    TreeIntersection init = new TreeIntersection();
    BinaryTree<Integer> tree1 = new BinaryTree<>();
    BinaryTree<Integer> tree2 = new BinaryTree<>();

    @Before
    public void initTree1() {
        tree1.root = new TreeNode<>(5);
        tree1.root.setLeftChild(new TreeNode<>(1));
        tree1.root.setRightChild(new TreeNode<>(6));
        tree1.root.getLeftChild().setRightChild(new TreeNode<>(3));
    }

    @Test
    public void testTreeIntersection() {
        tree2.root = new TreeNode<>(4);
        tree2.root.setLeftChild(new TreeNode<>(5));
        tree2.root.setRightChild(new TreeNode<>(1));
        tree2.root.getLeftChild().setLeftChild(new TreeNode<>(6));

        assertEquals("The treeIntersection method should return the array '[5, 6, 1]'.",
                "[5, 6, 1]",
                Arrays.toString(init.treeIntersection(tree1, tree2)));
    }
}