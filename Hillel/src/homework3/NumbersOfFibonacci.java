package homework3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yura on 29.06.15.
 */
public class NumbersOfFibonacci {
   public static long[] mem = new long[100];

    public static void main(String[] args) {
        System.out.println("Input quantity of numbers Fibonacci: ");
        Scanner scanner = new Scanner(System.in);
        mem[0] = 0;
        mem[1] = 1;
        int qtyNum = scanner.nextInt();

        for (int i=0; i<qtyNum; i++){
            System.out.println(i+1 + " " + fiboNumbers(i));
        }
    }

    public static long fiboNumbers(int n) {
        if (n == 0) {
          return 0;//BigInteger.ZERO;
        } else if (n==1){
            return 1;//BigInteger.ONE;
        } else if (containsVal(n)){
            return mem[n];
        } else
            mem[n] = fiboNumbers(n-2)+fiboNumbers(n-1);
            return mem[n];
    }

    public static boolean containsVal(int n) {
        if (mem[n] != 0){
            return true;
        } else
            return false;
    }

}
