package homework8;

/**
 * Created by yura on 19.07.15.
 */
public class Rectangle extends AbstractShape {

    private int sideA;
    private int sideB;

    public Rectangle(AbstractColor colorProperties, int a, int b) {
        super(colorProperties);
        this.sideA = a;
        this.sideB = b;

    }

    public double getSquare() {
        return sideA*sideB;
    }

}
