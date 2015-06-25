package homework2;

import java.util.Scanner;

/**
 * Created by yura on 25.06.15.
 */
public class AsteriskChess {

    public static void main(String[] args) {
        System.out.println("Write, please, width: ");
        Scanner scanner = new Scanner(System.in);
        int whidth = scanner.nextInt();

        System.out.println("Write, please, height: ");
        int heigth = scanner.nextInt();

        for (int i = 0; i < whidth; i++) {

            for (int j = 0; j < heigth; j++) {

                if ((i+j) % 2 == 0 ) {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

