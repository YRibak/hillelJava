package lesson8.singleton;

/**
 * Created by ITHILLEL2 on 17.07.2015.
 */
public class WebService {
    private static WebService service;
    private WebService() {
    }
    public static WebService getService(){
        if (service == null){
            service = new WebService();
        }
        return service;
    }

}
