import LinkedList.LinkedList;
import Graph.Graph;
import Sorts.InsertionSort;
import Sorts.MergeSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Michael Sloma on 2/27/2017.
 */
public class Testing {
    //public static void main(String[] args){
    //    LinkedList testing = new LinkedList();
//
    //    testing.insertAtStart(10);
    //    testing.insertAtPos(20, 1);
//
    //    testing.display();
    //}

    public static void main(String[] args){
        Graph<String> test1 = new Graph<String>();

        test1.addNode("A", new ArrayList<>(Arrays.asList("THings", "Stuff")));


        LinkedList<Integer> testing = new LinkedList<Integer>();
        testing.insertAtStart(10);
        testing.insertAtPos(20, 1);
        testing.add(15);
        testing.add(600);
        testing.add(500);
        testing.insertAtEnd(800);

        //testing.
        testing.display();

        ArrayList<Double> test = new ArrayList<>();
        test.add(5.);
        test.add(2.);
        test.add(4.);
        test.add(6.);
        test.add(1.);
        test.add(3.);
        test.add(9.);

        MergeSort.mergeSort(test);
        System.out.println(test);
    }
}
