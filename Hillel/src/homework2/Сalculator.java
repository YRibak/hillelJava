package calculator;


import java.util.Scanner;


public class Сalculator {

    public static void main(String[] args) {
        boolean t = true;
        Scanner scannerObject = new Scanner(System.in);
        do {

            System.out.println("Please input first number: ");
            double firstNumber = scannerObject.nextDouble();

            System.out.println("Please input second number: ");
            double secondNumber = scannerObject.nextDouble();
            System.out.println("Please input operations ('+', '-', '*', '/') or Press 'e' for exit");
            String operetionsType = scannerObject.next();

            System.out.println("This's first number: " + firstNumber);
            System.out.println("This's second number: " + secondNumber);

            switch (operetionsType){
                case "+":
                    summnumbers(firstNumber, secondNumber);
                    break;
                case "-":
                    minusnumbers(firstNumber, secondNumber);
                    break;
                case "*":
                    multiplicationnumbers(firstNumber, secondNumber);
                    break;
                case "/":
                    divisionnumbers(firstNumber, secondNumber);
                    break;
                case "e":
                    t = false;
                    break;
                default:
                    System.out.println("Please input operations ('+', '-', '*', '/') or Press 'e' for exit");
                    operetionsType = scannerObject.next();
            }
        } while (t);
    }


    public static void summnumbers(double firstNumber, double secondNumber) {

        System.out.println("Summ is: " + (firstNumber + secondNumber));
    }

    public static void minusnumbers(double firstNumber, double secondNumber) {

        System.out.println("Difference is: " + (firstNumber - secondNumber));
    }

    public static void multiplicationnumbers(double firstNumber, double secondNumber) {
        System.out.println("Multiplication is: " + (firstNumber * secondNumber));
    }

    public static void divisionnumbers(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Exception: Division by 0");
        } else {
            System.out.println("Division is: " +  (firstNumber / secondNumber));
        }
    }
}
