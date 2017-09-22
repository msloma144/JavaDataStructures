package Heap;

import java.util.ArrayList;

/**
 * Created by SlomaM on 5/17/2017.
 */
public class Heap {

    ArrayList<Integer> heap_array;

    public Heap(){
        this.heap_array = new ArrayList<>();
    }

    public Heap(ArrayList<Integer> input){
        heap_array = input;
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
        heap_array.add(added);
    }

    int length(){
        return heap_array.size();
    }

    public String toString(){
        System.out.println(heap_array);
        return null;
    }
}
