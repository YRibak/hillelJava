package homework6.myLinkedList;

/**
 * Created by yura on 12.07.15.
 */

public class Node <T>{
    T elem;
    Node next;


    public Node(T o,Node next) {
        this.elem = o;
        this.next = next;
    }
    public Node getNext(){
        return next;
    }

    public T getElem() {
        return elem;
    }
}
