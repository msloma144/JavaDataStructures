package Trees;

import java.util.ArrayList;

public class TreeNode<T> {
    private T data;
    private int rank;
    private TreeNode<T> parent;
    private ArrayList<TreeNode<T>> children;

    protected TreeNode(T data){
        this.data = data;
        this.children = new ArrayList<>();
        this.rank = 0;
    }
    TreeNode(T data, ArrayList<TreeNode<T>> children){
        this.data = data;
        this.children = children;
        this.rank = 0;
    }

    T getData() {
        return data;
    }

    void setData(T data) {
        this.data = data;
    }

    int getRank() {
        return rank;
    }

    void setRank(int rank) {
        this.rank = rank;
    }

    TreeNode<T> getParent() {
        return parent;
    }

    void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    ArrayList<TreeNode<T>> getChildren() {
        return children;
    }

    void setChildren(ArrayList<TreeNode<T>> children) {
        this.children = children;
    }
}
