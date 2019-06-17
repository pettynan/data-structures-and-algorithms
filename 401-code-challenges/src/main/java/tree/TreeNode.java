package tree;

public class TreeNode {
    private int value;
    private TreeNode leftChild;

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    private TreeNode rightChild;

    public int getValue() {
        return value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }



    public TreeNode() {}
    public TreeNode(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }
}
