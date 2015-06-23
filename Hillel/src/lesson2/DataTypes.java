package lesson2;

/**
 * Created by ITHILLEL2 on 23.06.2015.
 */
public class DataTypes {

    public static void main(String[] args) {

//        boolean b = false;
//        byte bYTE = 2;
//        int in = 2;
//        long lon = 2;
//        short sh = 3;
//        char ch = 'g';
//        float f = 3.3F;
//        double dou = 3.3;
//
//        String str = "Hello";


//        &&
//        ||
//        !

//        double fD = 1;
//        double sD = 2;
//        double tD = 3;
//
//        if ((fD < sD) && (sD<tD) )  {
//            System.out.println(tD);
//        } else if (((sD < tD) && (tD<sD) )) {
//            System.out.println(sD);
//        } else {
//            System.out.println(fD);
//        }
        int d = 1;
        switch (d){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
            default:
                System.out.println("Other day");
                break;

        }

        String s = "Monday";
        switch (s){
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
            default:
                System.out.println("Other day");
                break;

        }
        System.out.println("End");

        double dO  = 0.8; //
        double dT  = 0.8;
        double dF  = 0.8;
        double dS  = dT+dF;
        System.out.println(Math.abs(dO - dS)<0.0001);   // 0.0001 степень погрешности
}

    }

