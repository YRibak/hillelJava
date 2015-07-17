package lesson8.singleton;

/**
 * Created by ITHILLEL2 on 17.07.2015.
 */
public class WebService {
    private static WebService service = new WebService();
    private WebService() {
    }
    public static WebService getService(){
        return service;
    }

}
