package tree;

public class TreeNode<T> {
    public T value;
    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public T getValue() {
        return value;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }



    public TreeNode() {}
    public TreeNode(T value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }
}
