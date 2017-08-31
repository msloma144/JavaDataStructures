import java.util.ArrayList;

/**
 * Created by Michael Sloma on 2/24/2017.
 */
public class Stack<T> {
    private ArrayList<T> stack;

    Stack(){
        this.stack = new ArrayList<>();
    }

    T pop(){
        //returns top element
        if(!isEmpty()){
            T temp = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return temp;
        }
        else {
            System.out.println("Pop attempted on an empty stack!");
            return null;
        }
    }

    void push(T element){
        //Add element to the stack
        this.stack.add(element);
    }

    T top(){
        //Returns the value on top of the stack
        T topOfStack = null;

        if(!isEmpty()){
            return stack.get(stack.size()-1);
        }
        else{
            System.out.println("Top attempted on empty stack!");
            return null;
        }
    }

    boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
