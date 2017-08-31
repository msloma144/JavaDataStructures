package LinkedList;

/**
 * Created by SlomaM on 5/31/2017.
 */
public class LinkNode {
    int data;
    LinkNode link;

    LinkNode(){
        this.link = null;
        this.data = 0;
    }

    LinkNode(int data, LinkNode link){
        this.link = link;
        this.data = data;
    }

    //Setter methods
    void setLink(LinkNode link){
        this.link = link;
    }

    void setData(int data){
        this.data = data;
    }

    //Getter methods

    LinkNode getLink(){
        return this.link;
    }

    int getData(){
        return this.data;
    }
}
