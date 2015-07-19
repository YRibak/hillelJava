package homework8;

import java.util.ArrayList;

/**
 * Created by yura on 19.07.15.
 */
public class FigureList extends ArrayList{

    public double getTotalPrice(){
        double commonPrice = 0;
        for (Object i : this){
            AbstractShape item = (AbstractShape) i;
            commonPrice += item.getPrice();
        }
        return commonPrice;
    }
    public double getTotalWeigth(){
        double weight = 0;
        for (Object i : this){
            AbstractShape item = (AbstractShape) i;
            weight += item.consumption();
        }
        return weight;
    }

    public double getTotalSquire(){
        double square = 0;
        for (Object i : this){
            AbstractShape item = (AbstractShape) i;
            square += item.getSquare();
        }
        return square;
    }
}
