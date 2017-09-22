package Sorts;

import Heap.MaxHeap;
import Heap.MinHeap;

import java.util.ArrayList;

/**
 * Created by Michael Sloma on 9/7/2017.
 */
public class HeapSort {
    public static void maxHeapSort(ArrayList<Integer> toBeSorted){
        MaxHeap sortingHeap = new MaxHeap(toBeSorted);
        int listSize = toBeSorted.size();

        for( int i = 0; i < listSize; i++) {
            System.out.println(sortingHeap.readMaxElement());
        }
    }

    public static void minHeapSort(ArrayList<Integer> toBeSorted){
        MinHeap sortingHeap = new MinHeap(toBeSorted);
        int listSize = toBeSorted.size();

        for( int i = 0; i < listSize; i++) {
            System.out.println(sortingHeap.readMinElement());
        }
    }
}
