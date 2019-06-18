package tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    public TreeNode<T> root;
    private ArrayList array;

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
}
