package homework6.myLinkedList;

/**
 * Created by yura on 16.07.15.
 */
public interface MyList <T>{
    public int size();
    public boolean isEmpty();
    public boolean contains(T o);
    public boolean add(T o);
    public boolean remove(T o);
    public boolean addAll(MyLinkedList c);
    public void clear();
    public boolean retainAll(MyLinkedList<T> c);
    public boolean removeAll(MyLinkedList<T> c);
    public boolean containsAll(MyLinkedList<T> c);
}
