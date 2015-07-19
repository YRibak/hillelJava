package homework8;

/**
 * Created by yura on 19.07.15.
 */
public class Paralelogramm extends AbstractShape {

    private int sideA;
    private int sideB;
    private int angle;


    public Paralelogramm(AbstractColor colorProperties, int a, int b, int angle) {
        super(colorProperties);
        this.sideA = a;
        this.sideB = b;
        this.angle = angle;
    }

    public double getSquare() {
        return sideA*sideB*Math.sin(Math.toRadians(angle));
    }

}
