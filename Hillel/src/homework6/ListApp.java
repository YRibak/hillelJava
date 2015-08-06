package homework6;


import homework5.students.Student;
import homework6.myLinkedList.MyLinkedList;
import homework6.myLinkedList.Node;

import java.util.Iterator;

/**
 * Created by yura on 11.07.15.
 */
public class ListApp{
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        Student student1 = new Student(1,"Yura");
        Student student2 = new Student(2,"Vanya");
        Student student3 = new Student(3,"Kolya");
        Student student4 = new Student(4,"Serega");
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);
        myList.add(student4);
        System.out.println();
//        System.out.println("Size of collection: " + myList.size());
//        System.out.println("Collection is empty? - " + myList.isEmpty());
//        System.out.println("Item is contained in collection? - "+ myList.contains(student[2]));
//        System.out.println("Add all from other collection? -" + myList.addAll(myList));
//        System.out.println(myList.size());

        Iterator iter = myList.iterrator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("---------------");
        printList(myList.first);
    }
    public static void printList(Node item){
        if (item!=null){
             printList(item.getNext());
            System.out.println(item.getElem());
        }
    }
}
