package calculator;


import java.util.Scanner;


public class calculator {

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Please input first number: ");
        double firstNumber = scannerObject.nextDouble();

        System.out.println("Please input second number: ");
        double secondNumber = scannerObject.nextDouble();

        System.out.println("This's first number: " + summnumbers(firstNumber, secondNumber));
        System.out.println("Summ is: " + summnumbers(firstNumber, secondNumber));
        System.out.println("Difference is: " + minusnumbers(firstNumber, secondNumber));
        System.out.println("Multiplication is: " + multiplicationnumbers(firstNumber, secondNumber));
        System.out.println("Division is: " + divisionnumbers(firstNumber, secondNumber));

    }


    public static double summnumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double minusnumbers(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplicationnumbers(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divisionnumbers(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
