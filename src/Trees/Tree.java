package Trees;

import java.util.ArrayList;

/**
 * Created by Michael Sloma on 2/24/2017.
 */
public class Tree {
    ArrayList<Integer> tree;

    public Tree(){
        this.tree = new ArrayList<>();
    }

    public Tree(ArrayList<Integer> input){
        tree = input;
    }

    /*
        Returns the index of the child to the left of the root at the given index
     */
    int left(int index){
        return 2 * index + 1;
    }

    /*
        Returns the index of the child to the right of the root at the given index
    */
    int right(int index){
        return 2 * index + 2;
    }

    /*
        Returns the index of the parent of the child at the given index
    */
    int parent(int index) {
        return index / 2;
    }

    void add(int added){
        tree.add(added);
    }

    int length(){
        return tree.size();
    }

    public String toString(){
        System.out.println(tree);
        return null;
    }
}

