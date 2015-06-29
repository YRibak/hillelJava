package homework3;

import java.util.Scanner;

/**
 * Created by yura on 29.06.15.
 */
public class PointOnRectangle {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int x0, y0;
        System.out.println("Please input coordinate X0:");
        x0 = scaner.nextInt();
        System.out.println("Please input coordinate Y0:");
        y0 = scaner.nextInt();

        int x1, y1;
        System.out.println("Please input coordinate X1:");
        x1 = scaner.nextInt();
        System.out.println("Please input coordinate Y1:");
        y1 = scaner.nextInt();

        int xPoint, yPoint;
        System.out.println("Please input coordinate X of Point:");
        xPoint = scaner.nextInt();
        System.out.println("Please input coordinate Y of Point:");
        yPoint = scaner.nextInt();

        whereIsPoint(x0,y0,x1,y1,xPoint,yPoint);

    }
    public static void whereIsPoint (int x0, int y0, int x1, int y1, int xPoint, int yPoint) {
        if (x0 < xPoint && x1 > xPoint && y0 > yPoint && y1 < yPoint) {
            System.out.println("Point is on shape");
        }
        else {
            System.out.println("Point is not on shape");
        }
    }


}
