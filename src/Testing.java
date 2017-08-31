import LinkedList.LinkedList;
import Graph.Graph;

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

    }
}
