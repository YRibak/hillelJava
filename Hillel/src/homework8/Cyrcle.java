package homework8;

/**
 * Created by yura on 19.07.15.
 */
public class Cyrcle extends AbstractShape {

    private int radius;

    public Cyrcle(AbstractColor colorProperties, int r) {
        super(colorProperties);
        this.radius = r;
    }

    public double getSquare() {
        return (Math.PI * Math.pow(radius,2));
    }

}
