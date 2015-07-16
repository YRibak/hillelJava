package homework6.myLinkedList;

/**
 * Created by yura on 16.07.15.
 */
public interface MyList {
    public int size();
    public boolean isEmpty();
    public boolean contains(Object o);
    public boolean add(Object o);
    public boolean remove(Object o);
    public boolean addAll(MyLinkedList c);
    public void clear();
    public boolean retainAll(MyLinkedList c);
    public boolean removeAll(MyLinkedList c);
    public boolean containsAll(MyLinkedList c);
}
