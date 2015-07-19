package homework8;

import java.util.ArrayList;

/**
 * Created by yura on 19.07.15.
 */
public class FigureList extends ArrayList{

    public double getCommonPrice(){
        double commonPrice = 0;
        for (Object i : this){
            AbstractShape item = (AbstractShape) i;
            commonPrice += item.consumption();
        }
        return commonPrice;
    }
}
