package fizzbuzztree;

import tree.BinaryTree;
import tree.TreeNode;


public class FizzBuzzTree {

    public BinaryTree fizzBuzz(BinaryTree<String> initialTree) {

        fizzBuzzHelper(initialTree.root);

        return initialTree;
    }

    private void fizzBuzzHelper(TreeNode<String> node) {
            if (node.getLeftChild() != null) {
                fizzBuzzHelper(node.getLeftChild());
            }

            int toInt = Integer.parseInt(node.value);

            if (toInt % 15 == 0) {
                node.setValue("FizzBuzz");
            } else if (toInt % 5 == 0) {
                node.setValue("Buzz");
            } else if (toInt % 3 == 0) {
                node.setValue("Fizz");
            }

            if (node.getRightChild() != null) {
                fizzBuzzHelper(node.getRightChild());
            }
    }

}
