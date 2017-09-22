import java.util.ArrayList;

/**
 * Created by Michael Sloma on 2/24/2017.
 */
public class Queue<T> {
    private ArrayList<T> queue;

    public Queue(){
        this.queue = new ArrayList<>();
    }

    public void enqueue(T element){
        queue.add(element);
    }

    public T dequeue(){
        int endQueue = queue.size() - 1;

        if(!isEmpty()){
            T temp = queue.get(endQueue);
            queue.remove(endQueue);
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
