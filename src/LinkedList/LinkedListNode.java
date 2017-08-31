package LinkedList;

/**
 * Created by Michael Sloma on 2/24/2017.
 */
public class LinkedListNode<T> {
    private LinkedListNode link; // next nodes name
    private T data; //data in the node

    LinkedListNode(T data){
        this.data = data;
        this.link = null;
    }

    void setData(T data){
        this.data = data;
    }

    T getData(){
        return this.data;
    }

    void setLink(LinkedListNode link){
        this.link = link;
    }

    LinkedListNode getLink(){
        return this.link;
    }
    void newNode(LinkedListNode previousNode, T newNodeData){
    }

    void removeNode(T node){

    }
     void findNode(){

     }
}
