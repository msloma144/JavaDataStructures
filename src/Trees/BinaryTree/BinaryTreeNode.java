package Trees.BinaryTree;

import Trees.TreeNode;

public class BinaryTreeNode<T> extends TreeNode<T> {
    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;
    BinaryTreeNode(T data){
        super(data);
    }
}
