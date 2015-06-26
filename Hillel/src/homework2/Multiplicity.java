package homework2;

import java.util.Scanner;

/**
 * Created by yura on 26.06.15.
 */
public class Multiplicity {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Please, input number A");
        int numA = scannerObj.nextInt();
        System.out.println("Number " + numA + " divided by:");
        for (int i = 1; i<=numA; i++) {
            if (numA % i == 0) {
                System.out.print(" " + i);
            }
        }

    }
}
