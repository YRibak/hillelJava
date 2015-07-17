package lesson8;

/**
 * Created by ITHILLEL2 on 17.07.2015.
 */
public class Element {
    private Object data;
    private Element next;

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Object getData() {

        return data;
    }

    public Element getNext() {
        return next;
    }

    public Element(Element next,Object data) {

        this.data = data;
        this.next = next;
    }
}
