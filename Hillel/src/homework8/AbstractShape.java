package homework8;

/**
 * Created by yura on 19.07.15.
 */
abstract class AbstractShape {
    private AbstractColor colorProperties;

    public AbstractShape(AbstractColor colorProperties) {
        this.colorProperties = colorProperties;
    }

    public abstract double getSquare();

    public double consumption(){
        return getSquare()*getColorProperties().getConsumption();
    }

    public double getPrice(){
        return consumption()*getColorProperties().getPrice();
    }

    public AbstractColor getColorProperties() {
        return colorProperties;
    }
}
