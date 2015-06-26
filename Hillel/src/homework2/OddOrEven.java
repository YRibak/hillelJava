package homework2;

import java.util.Scanner;

/**
 * Created by yura on 26.06.15.
 */
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Please, input number");
        int numA = scannerObj.nextInt();
        if (numA % 2 == 0) {
            System.out.println("Number " + numA + " is even");
        }
        else {
            System.out.println("Number " + numA + " is odd");
        }
    }
}
