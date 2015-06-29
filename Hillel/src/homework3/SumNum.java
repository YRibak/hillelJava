package homework3;

import java.util.Scanner;

/**
 * Created by yura on 29.06.15.
 */
public class SumNum {
    public static void main(String[] args) {

        System.out.println("Please, input number:");
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        System.out.println(sumNumbers(number));
    }

    public static int sumNumbers(int number) {
        int sum = 0;
        while (number !=0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;

    }
}
