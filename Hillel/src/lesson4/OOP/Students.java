package lesson4.OOP;

/**
 * Created by ITHILLEL2 on 30.06.2015.
 */
public class Students {
    // fields
    public int id;           // = 0;
    public String surname;   // = null
    public int[] marks;      // =null

    public void come(){
        System.out.println("Student #" + id + " say Hello");
    }

    public void leave() {
        System.out.println("Good bye!!!");
    }
    
}
