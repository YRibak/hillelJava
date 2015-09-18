package homework19.dao.factory.mysql.connectionsPool;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by yura on 17.09.15.
 */
public abstract class  ObjectPool<T> {

    private Long expTime;
    private Hashtable<T, Long> lockedPool = new Hashtable<>();
    private Hashtable<T, Long> unlockedPool = new Hashtable<>();

    public ObjectPool() {
        expTime = 20000L;
    }

    public ObjectPool(Long expTime) {
        this.expTime = expTime;
    }

    public abstract T create();
    public abstract boolean validate(T o);
    public abstract void expired(T o);

    public T checkOut(){
        Long now = System.currentTimeMillis();
        T tempElem = null;
        if(unlockedPool.size()>0){
            Enumeration<T> e = unlockedPool.keys();
            while (e.hasMoreElements()){
                tempElem = e.nextElement();
                if ((now - unlockedPool.get(tempElem))>expTime ){
                    unlockedPool.remove(tempElem);
                    expired(tempElem);
                } else {
                    if(validate(tempElem)){
                        unlockedPool.remove(tempElem);
                        lockedPool.put(tempElem, now);
                        return tempElem;
                    } else {
                        unlockedPool.remove(tempElem);
                        expired(tempElem);
                    }
                }
            }
        }
        tempElem = create();
        lockedPool.put(tempElem, now);
        return tempElem;
    }

    public boolean checkIn(T o){
        lockedPool.remove(o);
        unlockedPool.put(o, System.currentTimeMillis());
        return true;
    }


}
