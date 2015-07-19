package homework8;

/**
 * Created by yura on 19.07.15.
 */
public abstract class AbstractColor {
    private String color;
    private double consumption;
    private double price;


    public AbstractColor(String color, double expense, double price) {
        this.color = color;
        this.consumption = expense;
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public double getConsumption() {
        return consumption;
    }

    public double getPrice() {
        return price;
    }
}
