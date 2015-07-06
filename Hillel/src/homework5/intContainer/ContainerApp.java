package homework5.intContainer;

/**
 * Created by yura on 06.07.15.
 */
public class ContainerApp {
    public static void main(String[] args) {
        IntContainer my = new IntContainer();
        for(int i=0; i<100; i++){
            my.setIntNum((int) (Math.random()*10000));
        }

        System.out.println(my.getIntNum(0));
        my.setIntNum(200);
        System.out.println(my.getIntNum(1));
        my.sortNum();
        for(int val : my.getIntNum()){
            System.out.println(val);
        }
        System.out.println(my.contains(300) ? "contains" : "not contains");
    }

}
