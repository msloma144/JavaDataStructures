package Trees;

import java.util.ArrayList;

/**
 * Created by Michael Sloma on 6/24/2017.
 */
public class BinarySearchTree extends Tree{
    private int separationValue;
    private ArrayList<Integer> tree;

    BinarySearchTree(){
        super();
        this.separationValue = 0;
    }

    BinarySearchTree(ArrayList<Integer> input){
        this.tree = input;
        this.separationValue = 0;
    }

    BinarySearchTree(ArrayList<Integer> input, int separationValue){
        this.tree = input;
        this.separationValue = separationValue;
    }

    public void add(){

    }

    public void remove(){

    }

    public void search(){

    }
}
