import java.util.ArrayList;

/**
 * Created by Michael Sloma on 2/24/2017.
 */
public class Queue<T> {
    ArrayList<T> queue;

    Queue(){
        this.queue = new ArrayList<>();    }

    void enqueue(T element){
        queue.add(element);
    }

    T dequeue(){
        if(!isEmpty()){
            T temp = queue.get(0);
            queue.remove(0);
            return temp;
        }
        else {
            System.out.println("Dequeue attempted on empty queue!");
            return null;
        }
    }

    boolean isEmpty(){
        if(queue.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
