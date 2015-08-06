package homework6.myLinkedList;
import homework5.students.Student;
import lesson4.OOP.Students;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


/**
 * Created by yura on 12.07.15.
 */
public class MyLinkedList <T> implements MyList <T>{
    int size;
    Node prev;
   public Node first;


    public MyLinkedList() {
    }

    public boolean contains(T o){
        Node current = this.first;
        while (current != null){
            if(current.elem.equals(o)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean remove(T o){
        Node current = this.first;
        Node prev = null;
        while (current != null){
            prev = current;
            if(current.elem.equals(o)){
                prev.next = current.next;
                --size;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean retainAll(MyLinkedList c) {
        T[] collection = (T[])toArray(c);
        MyLinkedList temp = null;
        for(T elem : collection){
            if (!contains(elem)){
                temp.add(elem);
            }
        }
        if(temp != null){
            clear();
            addAll(temp);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(MyLinkedList c) {
        T[] collection = (T[])toArray(c);
        boolean rem = false;
        for(T elem : collection){
            if (!rem){
                rem = remove(elem);
            }else{
                remove(elem);
            }
        }
        return rem;
    }

    @Override
    public boolean containsAll(MyLinkedList c) {
       T[] collection = (T[]) toArray(c);
        for(T elem : collection){
            if (contains(elem)){
                return true;
            }
        }
        return false;
    }

    public boolean add(T o) {
        Node link = this.prev;
        Node newNode = new Node(o, null);
        if (link != null){
            link.next = newNode;
        }
        else {
            this.first = newNode;
        }
        this.prev = newNode;
        size++;
        return true;
    }

    private Object[] toArray(MyLinkedList c){
        Object[] elem = new Object[this.size];
        int count = 0;
        for (Node i=c.first; i!=null; i=i.next){
            elem[count] = i;
            count++;
        }
        return elem;
    }
    public boolean addAll(MyLinkedList c){
        T[] a = (T[])toArray(c);
        for(T elem : a){
            add(elem);
        }
        return true;
    }

    public void clear(){
        this.first = null;
        size = 0;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public MyIterator iterrator(){
        return new MyIterator(first);
    }
}

class MyIterator implements Iterator {
    Node item = null;

    public MyIterator(Node first) {
        this.item = first;
    }

    @Override
    public boolean hasNext() {
        return  item != null;
    }

    @Override
    public  Node next() {
        Node temp;
        temp = item;
        item = item.next;
        return temp;
    }
}