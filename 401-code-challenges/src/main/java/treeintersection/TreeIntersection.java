package treeintersection;

import hashtable.HashTable;
import tree.BinaryTree;
import tree.TreeNode;

import java.util.ArrayList;


public class TreeIntersection {
    private HashTable hashTable;
    private ArrayList<Integer> arrayList;


    public int[] treeIntersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2) {
        hashTable = new HashTable(16);
        arrayList = new ArrayList();

        treeIntersectionHelper(tree1.root);

        treeIntersectionComparer(tree2.root);

        //https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
        return arrayList.stream().mapToInt(i -> i).toArray();
    }

    private void treeIntersectionHelper(TreeNode root) {
        hashTable.add(root.getValue().toString(), root.getValue().toString());

        if (root.getLeftChild() != null) {
            treeIntersectionHelper(root.getLeftChild());
        }
        if (root.getRightChild() != null) {
            treeIntersectionHelper(root.getRightChild());
        }
    }

    private void treeIntersectionComparer(TreeNode<Integer> root) {
//        System.out.println(root.getValue().toString());
        if ( hashTable.contains(root.getValue().toString()) ) {
            arrayList.add(root.getValue().intValue());
//            System.out.println("I AM PRINTING");
        }


        if (root.getLeftChild() != null) {
            treeIntersectionComparer(root.getLeftChild());
        }
        if (root.getRightChild() != null) {
            treeIntersectionComparer(root.getRightChild());
        }
    }
}
