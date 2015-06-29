package homework3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by yura on 29.06.15.
 */
public class NumbersOfFibonacci {
    public static void main(String[] args) {
        System.out.println("Input quantity of numbers Fibonacci: ");
        Scanner scanner = new Scanner(System.in);
        int qtyNum = scanner.nextInt();
        for (int i=0; i<qtyNum; i++){
            System.out.println(fiboNumbers(i));
        }
    }

    public static int fiboNumbers(int n) {
        if (n == 0) {
          return 0;
        } else if (n==1){
            return 1;
        } else
            return fiboNumbers(n-2)+fiboNumbers(n-1);

    }
}
