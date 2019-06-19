package tree;

import stacksandqueues.Queue;

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

    public void breadthFirst() {
        Queue<TreeNode<T>> queue = new Queue<>();
        TreeNode<T> current;
        queue.enqueue(this.root);

        while(queue.getFront() != null) {
            current = queue.dequeue();
            if (current.getLeftChild() != null) {
                queue.enqueue(current.getLeftChild());
            }
            if (current.getRightChild() != null) {
                queue.enqueue(current.getRightChild());
            }
            System.out.println(current.value);
        }
    }
}
