import Heap.Heap;
import LinkedList.LinkedList;
import Graph.Graph;
import Sorts.HeapSort;
import Sorts.InsertionSort;
import Sorts.MergeSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Michael Sloma on 2/27/2017.
 */
public class Testing {
    public static void main(String[] args){
        Graph<String> test1 = new Graph<String>();

        test1.addNode("A", new ArrayList<>(Arrays.asList("THings", "Stuff")));

        //Linked List Testing
        LinkedList<Integer> testing = new LinkedList<Integer>();
        testing.add(20);
        testing.add(50);
        testing.insertAtEnd(60);
        testing.insertAtStart(700);
        testing.insertAtStart(10);
        testing.insertAtPos(20, 1);
        testing.add(15);
        testing.add(600);
        testing.add(500);
        testing.insertAtEnd(800);
        testing.insertAtPos(20, 8);
        testing.search(60);
        System.out.println(testing.get(4));
        testing.display();

        //HeapSort Testing
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(2);
        test.add(4);
        test.add(6);
        test.add(1);
        test.add(3);
        test.add(9);

        //Graph Testing
        Graph<String> graph1 = new Graph<String>();
        graph1.addNode("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph1.addNode("B", new ArrayList<String>(Arrays.asList("A", "D", "E")));
        graph1.addNode("C", new ArrayList<String>(Arrays.asList("A", "F")));
        graph1.addNode("D", new ArrayList<String>(Arrays.asList("B", "G")));
        graph1.addNode("E", new ArrayList<String>(Arrays.asList("B")));
        graph1.addNode("F", new ArrayList<String>(Arrays.asList("C", "G")));
        graph1.addNode("G", new ArrayList<String>(Arrays.asList("D", "F", "H")));
        graph1.addNode("H", new ArrayList<String>(Arrays.asList("G")));
        //BFS
        graph1.BFSshortest_path("A", "G");

        //Heap t1 = new Heap(test);
        //HeapSort.maxHeapSort(test);
        //System.out.println(t1);
    }
}
