package Graph;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Michael Sloma on 2/24/2017.
 */
public class Graph<T> {
    //Adjacency List
    HashMap<T, ArrayList<T>> adjacencyMap;

    public Graph(){
        this.adjacencyMap = new HashMap<>();
    }

    public void addNode(T newNode){
        this.adjacencyMap.put(newNode, new ArrayList<>());
    }

    public void addNode(T newNode, ArrayList<T> adjList){
        this.adjacencyMap.put(newNode, adjList);
    }

    public void deleteNode(T delNode){
        this.adjacencyMap.remove(delNode);
    }

    public void addAdjNode(T startNode, T endNode){
        this.adjacencyMap.get(startNode).add(endNode);
        this.adjacencyMap.get(endNode).add(startNode);
    }

    public void removeAdjNode(T node, T delNode){
        this.adjacencyMap.get(node).add(delNode);
        this.adjacencyMap.get(delNode).remove(node);
    }

}
