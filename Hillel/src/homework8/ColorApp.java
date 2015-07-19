package homework8;

/**
 * Created by yura on 19.07.15.
 */
public class ColorApp {
    public static void main(String[] args) {
        Red red = new Red(2,50);
        Blue blue = new Blue(15,10);
        White white = new White(30, 20);
        Rectangle rect = new Rectangle(red,10,50);
        Cyrcle cyrcle = new Cyrcle(blue, 50);
        Paralelogramm p = new Paralelogramm(white, 10, 20, 30);
        System.out.println("S rect = " + rect.getSquare() + " price " + rect.getPrice());
        System.out.println("S Cyrcle = " + cyrcle.getSquare() + " price " + cyrcle.getPrice());
        System.out.println("S paralelogramm = " + p.getSquare() + " price " + p.getPrice());
        FigureList list = new FigureList();
        list.add(rect);
        list.add(cyrcle);
        list.add(p);

        System.out.println("Total price " + list.getTotalPrice());
        System.out.println("Total weight " + list.getTotalWeigth());
        System.out.println("Total square " + list.getTotalSquire());

    }
}
