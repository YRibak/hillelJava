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
        
        for (int i = 0; i < envSize; i++) {

            for (int j = 0; j < envSize; j++) {
                char str;
                if (i == j || j == (envSize -1 - i)) {
                    str = '*';
                } else if (i == 0 || i ==envSize - 1) {
                    str = '*';
                } else if (j == 0 || j ==envSize - 1) {
                    str = '*';
                } else {
                    str = ' ';
                }
                System.out.print(str);
            }

            System.out.print("\n");

        }
    }
}
