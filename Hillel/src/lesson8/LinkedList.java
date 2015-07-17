package lesson8;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by ITHILLEL2 on 17.07.2015.
 */
public class LinkedList implements Collection{
    private Element first;

    @Override
    public int size() {
        int size = 0;
        Element currentElement = first;
        while (currentElement != null){
            size++;
            currentElement = currentElement.getNext();
        }
        return size;
        //TODO optimize
    }

    @Override
    public boolean isEmpty() {
       return first == null;
    }

    @Override
    public boolean contains(Object o) {
        Element currentElement = first;
        while (currentElement != null){
            if (currentElement.getData().equals(o)){
                return true;
            }
            currentElement = currentElement.getNext();
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return null;//new Object[];
    }

    private Element getLastElement(){
        Element lastElement = first;
        if (lastElement == null){
            return lastElement;
        }
        while (lastElement != null){
            lastElement = lastElement.getNext();
        }
        return lastElement;
    }

    public boolean add(Object o) {
        Element toAdd = new Element(null, o);
        Element lastElement = getLastElement();
        if (lastElement == null){
            first = toAdd;
        }else{
            lastElement.setNext(toAdd);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {
        LinkedList new1 = new LinkedList();
        System.out.println(new1);
    }

    //TDD
    @Override
    public String toString(){
        String result = "";
        Element currentElement = first;
        if (currentElement == null){
            return result;
        }
        while (currentElement != null){
            result += currentElement.getData()+", ";
            currentElement = currentElement.getNext();
        }
        return result;
    }
}
