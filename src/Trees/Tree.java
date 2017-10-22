package Trees;

import java.util.ArrayList;

/**
 * Created by Michael Sloma on 2/24/2017.
 */
//WORK IN PROGRESS
public class Tree<T> {
    private TreeNode root;
    private int size;

    public Tree(){
        this.root = null;
    }

    public Tree(ArrayList<T> input){
        this.root = new TreeNode<>(input.get(0));

        for(int i = 1; i < input.size()/2; i++){
            this.add(this.root, input.get(i));
        }
    }

    public void add(TreeNode<T> parent, T data){
        /* If the tree is empty, return a new node */
        TreeNode<T> thisNode = new TreeNode<>(data);

        if (this.root == null) {
            this.root = thisNode;
        }
        else {
            parent.getChildren().add(thisNode);
        }
    }

    public void add(TreeNode<T> parent, ArrayList<TreeNode<T>> children, T data){
        /* If the tree is empty, return a new node */
        TreeNode<T> thisNode = new TreeNode<>(data, children);

        if (this.root == null) {
            this.root = thisNode;
        }
        else {
            parent.getChildren().add(thisNode);
        }
    }

    void search(TreeNode<T> node){

    }

    public void DFS_pre_order(TreeNode<T> node){
        if (node.getChildren().equals(null))
            return;
        //if(node.equals())
        for (TreeNode<T> nextNode: node.getChildren()) {
            DFS_pre_order(nextNode);
        }
    }

    public void DFS_in_order(){

    }

    public void DFS_post_order(){

    }
}

