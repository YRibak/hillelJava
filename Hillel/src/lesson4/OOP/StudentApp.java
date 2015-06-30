package lesson4.OOP;

/**
 * Created by ITHILLEL2 on 30.06.2015.
 */
public class StudentApp {
    public static void main(String[] args) {
        Students students = new Students();
        System.out.println(students.id);
        students.id = 99;
        System.out.println(students.id);

        Students students2 = new Students();
        students2.id = 100;
        students2.come();

    }
}
