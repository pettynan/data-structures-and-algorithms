package tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    public TreeNode<T> root;
    private ArrayList array;
    private int max;

    public BinaryTree() {}
    public BinaryTree(TreeNode<T> root) {
        this.root = root;
    }



    // ArrayList<T> outputArray = new ArrayList<>();
    public ArrayList preOrder(BinaryTree tree) {
        array = new ArrayList();

        preOrderHelper(tree.root);

        return this.array;
    }

    private void preOrderHelper(TreeNode root) {
        array.add(root.getValue());

        if (root.getLeftChild() != null) {
            preOrderHelper(root.getLeftChild());
        }
        if (root.getRightChild() != null) {
            preOrderHelper(root.getRightChild());
        }
    }

    public ArrayList postOrder(TreeNode root) {
        array = new ArrayList();

        postOrderHelper(root);

        return this.array;
    }

    private void postOrderHelper(TreeNode root) {
        if (root.getLeftChild() != null) {
            postOrderHelper(root.getLeftChild());
        }
        if (root.getRightChild() != null) {
            postOrderHelper(root.getRightChild());
        }
        array.add(root.getValue());
    }

    public ArrayList inOrder(TreeNode root) {
        array = new ArrayList();

        inOrderHelper(root);

        return this.array;
    }

    private void inOrderHelper(TreeNode root) {
        if (root.getLeftChild() != null) {
            inOrderHelper(root.getLeftChild());
        }

        array.add(root.getValue());

        if (root.getRightChild() != null) {
            inOrderHelper(root.getRightChild());
        }
    }

    public int findMaximumValue(TreeNode<Integer> root) {
        this.max = root.value;

        findMaxValueHelper(root);

        return this.max;
    }

    private void findMaxValueHelper(TreeNode<Integer> node) {
        if (node.getLeftChild() != null) {
            findMaxValueHelper(node.getLeftChild());
        }

        this.max = (max > node.value) ? max : node.value;

        if (node.getRightChild() != null) {
            findMaxValueHelper(node.getRightChild());
        }
    }

}
