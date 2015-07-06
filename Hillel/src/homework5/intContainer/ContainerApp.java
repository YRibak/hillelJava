package homework5.intContainer;

/**
 * Created by yura on 06.07.15.
 */
public class ContainerApp {
    public static void main(String[] args) {
        IntContainer intObj = new IntContainer();
        for(int i=0; i<100; i++){
            intObj.setIntNum((int) (Math.random() * 10000));
        }

        System.out.println(intObj.getIntNum(0));
        intObj.setIntNum(200);
        System.out.println(intObj.getIntNum(1));
        intObj.sortNum();
        for(int val : intObj.getIntNum()){
            System.out.println(val);
        }
        System.out.println(intObj.contains(300) ? "contains" : "not contains");
    }

}
