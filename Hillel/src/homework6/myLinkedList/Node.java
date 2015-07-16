package homework6.myLinkedList;

/**
 * Created by yura on 12.07.15.
 */

public class Node {
    Object elem;
    Node next;


    public Node(Object o,Node next) {
        this.elem = o;
        this.next = next;
    }
    public Node getNext(){
        return next;
    }

    public Object getElem() {
        return elem;
    }
}
