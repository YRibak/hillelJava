package lesson12.animals.observers;

import lesson12.observable.Observer;

/**
 * Created by ITHILLEL2 on 31.07.2015.
 */
public class SicknessObserver implements Observer {
    @Override
    public void handle() {
        System.out.println("Thats not my job");
    }
}
