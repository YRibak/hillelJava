package homework2;

import java.util.Scanner;

/**
 * Created by yura on 25.06.15.
 */
public class Envelope {
    public static void main(String[] args) {
        System.out.println("Please write, please, size of your envelope: ");
        Scanner scanner = new Scanner(System.in);
        int envSize = scanner.nextInt();
        
        for (int i = 1; i <= envSize; i++) {
            System.out.print("*");
            for (int j = 1; j <=envSize; j++) {
                String str;
                if (i == j || j == (envSize+1-i)) {
                    str = "*";
                } else if (i == 1 || i ==envSize){
                    str = "*";
                } else {
                    str = " ";
                }
                System.out.print(str);
            }

            System.out.println("*");

        }
    }
}
