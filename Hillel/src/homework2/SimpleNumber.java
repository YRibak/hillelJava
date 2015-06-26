package homework2;

import java.util.Scanner;

/**
 * Created by yura on 26.06.15.
 */
public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Please, input number");
        int numA = scannerObj.nextInt();
        if (numA % 2 == 0 ) {
            System.out.println("Entered number isn't simple");
        }
        else {
            for (int i = 3; i<numA; i +=2){
                if (numA % i == 0){
                    System.out.println("Entered number isn't simple");
                    break;
                }
            }
        }
    }

}
