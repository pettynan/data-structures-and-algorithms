//package tree;
//
//public class BinarySearchTree extends BinaryTree {
//    private int value;
//
//    public void add(int value) {
//        this.value = value;
//        if (this.root == null) {
//            this.root = new TreeNode(value);
//        } else {
//            addHelper(this.root);
//        }
//    }
//
//    private void addHelper(TreeNode node) {
//        if (value == node.getValue()) {
//            System.out.println("value " + value + " already exists in Binary Search Tree.");
//        }
//        if (value < node.getValue()) {
//            if (node.getLeftChild() == null) {
//                node.setLeftChild(new TreeNode(value));
//            } else {
//                addHelper(node.getLeftChild());
//            }
//        }
//        if (value > node.getValue()) {
//            if (node.getRightChild() == null) {
//                node.setRightChild(new TreeNode(value));
//            } else {
//                addHelper(node.getRightChild());
//            }
//        }
//    }
//
//    public boolean contains(int value) {
//        this.value = value;
//        return containsHelper(this.root);
//    }
//
//    private boolean containsHelper(TreeNode node) {
//        if (node.getValue() == value) {
//            return true;
//        } else if (value < node.getValue() && node.getLeftChild() != null) {
//            return containsHelper(node.getLeftChild());
//        } else if (value > node.getValue() && node.getRightChild() != null) {
//            return containsHelper(node.getRightChild());
//        }
//        return false;
//
//    }
//}
