package Graph;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Michael Sloma on 2/24/2017.
 */
public class Graph<T> {
    //Adjacency List
    private HashMap<T, ArrayList<T>> adjacencyMap;

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

    public ArrayList<T> getAdjacentNodes(T node){
        return this.adjacencyMap.get(node);
    }

    public Object[] BFSearch(T source){
        HashMap<T, Integer> level = new HashMap<>();
        level.put(source, 0);

        HashMap<T, T> parent = new HashMap<>();
        parent.put(source, null);

        ArrayList<T> frontier = new ArrayList<>();
        frontier.add(source);

        int i = 1;

        while (!frontier.isEmpty()){
            ArrayList<T> next = new ArrayList<>();
            for(T node: frontier){
                ArrayList<T> list = adjacencyMap.get(node);
                for(T vertex: list){
                    if(!level.containsKey(vertex)){
                        level.put(vertex, i);
                        parent.put(vertex, node);
                        next.add(vertex);
                    }
                }
            }
            frontier = next;
            i += 1;
        }
        return new Object[]{level, parent};
    }

    public void BFSshortest_path(T source, T destination){
        Stack<T> path = new Stack<>();
        T currNode = destination;
        path.push(currNode);

        Object[] tmp = BFSearch(source);
        HashMap<T, Integer> level = (HashMap<T, Integer>)tmp[0];
        HashMap<T, T> parent = (HashMap<T, T>)tmp[1];

        while (!currNode.equals(source)){
            T nextNode = parent.get(currNode);
            path.push(nextNode);
            currNode = nextNode;
        }

        System.out.println("Level: " + level.get(destination));
        System.out.print(path.pop());
        for(int i = 0; i < (level.get(destination)); i++){
            System.out.print(" -> " + path.pop());
        }
    }
}
