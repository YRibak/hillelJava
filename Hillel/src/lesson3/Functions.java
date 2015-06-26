package lesson3;

/**
 * Created by ITHILLEL2 on 26.06.2015.
 */
public class Functions {
//    функции, методы
//
    public static void main(String[] args) {
        double f = 10;
        double s = 20;
        double result;
        result = add(f,s);
        System.out.println(result);
    }
    public static double add (double first, double second)  {
        double sum = first + second;
        return sum;
    }
}

