package calculator;


import java.util.Scanner;


public class calculator {

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Please input first number: ");
        double firstNumber = scannerObject.nextDouble();

        System.out.println("Please input second number: ");
        double secondNumber = scannerObject.nextDouble();

        System.out.println("This's first number: " + firstNumber);
        System.out.println("This's second number: " + secondNumber);
    }

}
