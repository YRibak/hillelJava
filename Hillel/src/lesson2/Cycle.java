package lesson2;

/**
 * Created by ITHILLEL2 on 23.06.2015.
 */
public class Cycle {
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            System.out.println(i);
            ++i;
        }
       //-----------------
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);

       //-----------------
        for (int j = 0; j<10; j++){
            System.out.println(j);
        }
    }
}


//continue
//brake