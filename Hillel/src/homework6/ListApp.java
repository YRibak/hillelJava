package homework6;


import homework5.students.Student;
import homework6.myLinkedList.MyLinkedList;
import java.util.Iterator;

/**
 * Created by yura on 11.07.15.
 */
public class ListApp{
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        Student[] student = new Student[3];
        student[0] = new Student(1, "Ivanov");
        student[1] = new Student(2, "Petrov");
        student[2] = new Student(3, "Sidorov");
        for(Student item : student){
            myList.add(item);
        }


        System.out.println("Size of collection: " + myList.size());
        System.out.println("Collection is empty? - " + myList.isEmpty());
        System.out.println("Item is contained in collection? - "+ myList.contains(student[2]));
        System.out.println("Add all from other collection? -" + myList.addAll(myList));
        System.out.println(myList.size());

        Iterator iter = myList.iterrator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
