package homework19.dao.factory.mysql.connectionsPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by yura on 17.09.15.
 */
public class PgConnectPool extends ObjectPool{
    private  String dsn;
    private  String uname;
    private  String pass;

    public PgConnectPool(Long expTime, String driver, String dsn, String uname, String pass) {
        super(expTime);
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.dsn = dsn;
        this.uname = uname;
        this.pass = pass;
    }


    @Override
    public Connection create() {
        try {
            return(DriverManager.getConnection(dsn, uname, pass));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean validate(Object o) {
        if(true) return true;
        try {
            return !((Connection)o).isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void expired(Object o) {
        try {
            ((Connection) o).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
