package LinkedList;

/**
 * Created by SlomaM on 5/31/2017.
 */
public class LinkedList {
    LinkNode startNode;
    LinkNode endNode;
    int size;

    public LinkedList(){
        this.startNode = null;
        this.endNode = null;
        this.size = 0;
    }

    //checks if list is empty
    public boolean isEmpty(){
        return startNode == null;
    }

    //Insert node at start of link-list
    public void insertAtStart(int dataVal){
        LinkNode newNode = new LinkNode(dataVal,null);
        size++;
        if(startNode == null){
            startNode = newNode;
            endNode = startNode;
        }

        else{
            newNode.setLink(startNode);
            startNode = newNode;
        }
    }

    //Insert node at end of link-list
    void insertAtEnd(int dataVal){
        LinkNode newNode = new LinkNode(dataVal,null);
        size++;
        if(startNode == null){
            startNode = newNode;
            endNode = startNode;
        }

        else{
            endNode.setLink(newNode);
            endNode = newNode;
        }
    }

    //Insert a new node at position
    public void insertAtPos(int dataVal, int pos){
        LinkNode newNode = new LinkNode(dataVal, null);
        LinkNode startNode = this.startNode;
         pos--;
         for(int i = 0; i < size; i++){
             if(i == pos){
                 LinkNode tmp =  startNode.getLink();
                 startNode.setLink(newNode);
                 newNode.setLink(tmp);
                 break;
             }
             startNode = startNode.getLink();
         }
         size++;
    }

    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (startNode.getLink() == null)
        {
            System.out.println(startNode.getData() );
            return;
        }
        LinkNode ptr = startNode;
        System.out.print(startNode.getData()+ "->");
        ptr = startNode.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }

    public int getSize(){
        return size;
    }
}
