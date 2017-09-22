package Heap;

import java.util.ArrayList;

/**
 * Created by SlomaM on 5/17/2017.
 */
public class MaxHeap extends Heap{
    public MaxHeap(){
        super();
    }

    public MaxHeap(ArrayList<Integer> input){
        super(input);
        buildMaxHeap();
    }

    //checks if an entry is a leaf, as if it is a leaf, it can present out of bounds error when processing
    //the heapify.
    private boolean isLeaf(int index)
    {
        return index >= (heap_array.size() / 2) && index <= heap_array.size();
    }

    public void maxHeapify(int index){
        int leftChild = left(index);
        int rightChild = right(index);
        int largest = 0;

        //checks to make sure that the index is not a leaf to
        //avoid out of bounds errors
        if(!isLeaf(index)) {

            if ((leftChild < heap_array.size()) && (heap_array.get(leftChild) > heap_array.get(index))) {
                largest = leftChild;
            } else {
                largest = index;
            }

            if ((rightChild < heap_array.size()) && (heap_array.get(rightChild) > heap_array.get(largest))) {
                largest = rightChild;
            }

            if (largest != index) {
                //swap the parent with the larger child and run again
                int index_val = heap_array.get(index);
                heap_array.set(index, heap_array.get(largest));
                heap_array.set(largest, index_val);

                maxHeapify(largest);
            }
        }
    }

    private void buildMaxHeap(){
        // heapify from the bottom up
        for(int i = (heap_array.size()/2); i >= 0; i--){
            maxHeapify(i);
        }
    }

    public void add(int element){
        heap_array.add(element);

        //set currently looked at position to most recently added
        int current = heap_array.size() - 1;

        //while the current node is larger than the parent node...
        while (heap_array.get(current) > heap_array.get(parent(current))){

            //swap the values
            int index_val = heap_array.get(current);
            heap_array.set(current, heap_array.get(parent(current)));
            heap_array.set(parent(current), index_val);

            //set the parent to the currently evaluated position
            current = parent(current);
        }
    }

    public int readMaxElement(){
        //swap first and last elements then delete last element
        int maxElement =  heap_array.get(0);
        heap_array.set(0, heap_array.get(heap_array.size() - 1));
        heap_array.remove(heap_array.size() - 1);
        //re-heapify
        maxHeapify(0);

        return maxElement;
    }
}
