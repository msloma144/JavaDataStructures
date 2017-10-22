package Trees.BinaryTree;

import Trees.Tree;
import Trees.TreeNode;

import java.util.ArrayList;

public class BinaryTree<T> extends Tree<T> {
    void add(TreeNode<T> parent, ArrayList<TreeNode<T>> children, T data){
        /* If the tree is empty, return a new node */
        TreeNode<T> thisNode = new TreeNode<>(data);
        if (this.root == null) {
            this.root = thisNode;
        }
        else {
            parent.getChildren().add(thisNode);
            if(parent.getLeft() == null){
                parent.setLeft(new TreeNode<>(data));
                parent.setRank(parent.getRank() + 1);
            }
            else if(parent.getRight() == null){
                parent.setRight(new TreeNode<>(data));
                parent.setRank(parent.getRank() + 1);
            }
            else{
                System.out.println("No space to enter child!");
            }
        }
    }

    public void DFS_pre_order(TreeNode<T> node){
        if (node.getChildren().equals(null))
            return;
        //if(node.equals())
        DFS_pre_order(nextNode);
    }

    public void DFS_in_order(){

    }

    public void DFS_post_order(){

    }
}
