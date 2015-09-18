package homework19.dao.factory.mysql;



import homework19.dao.businessobjects.Account;
import homework19.dao.factory.AccountDao;
import homework19.dao.factory.mysql.connectionsPool.PgConnectPool;
import lesson8.LinkedList;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Collection;
import java.util.Hashtable;

/**
 * Created by VSulevskiy on 14.09.2015.
 */
public class DbAccountDao implements AccountDao {
    private static final String USERNAME = "testUser";
    private static final String PASSWORD = "test";
    private Connection con = null;

    public void getConnection() {
        PgConnectPool pool = new PgConnectPool(20000L, "org.postgresql.Driver",
                "jdbc:postgresql://localhost/test", USERNAME, PASSWORD);
        con = (Connection)pool.checkOut();
    }

    @Override
    public boolean insertAccount(Account account) {
        getConnection();
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(
                    "INSERT INTO test.account" +
                            "(account_id, balance) VALUES" +
                            "(? , ?)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.setLong(1, account.getId());
            statement.setBigDecimal(2, account.getBalance());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (statement != null) statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean deleteAccount(Account account) {

        getConnection();
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(
                    "DELETE FROM test.account" +
                            " WHERE account_id = ?");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.setLong(1, account.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (statement != null) statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Account findAccount(long id) {
        getConnection();
        String sqlQuery = "SELECT balance FROM test.account" +
                " WHERE account_id = ?";
            try {
                PreparedStatement statement = con.prepareStatement(sqlQuery);
                statement.setLong(1, id);
                ResultSet resultSet = statement.executeQuery();
                resultSet.next();
                Account account = new Account(id);
                BigDecimal balance = resultSet.getBigDecimal(1);
                account.setBalance(balance);
                return account;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }

    }

    @Override
    public boolean updateAccount(Account account) {
        String sqlQuery = "UPDATE test.account" +
                " SET balance = ?" +
                " WHERE account_id = ?";
        try {
            getConnection();
            PreparedStatement statement = con.prepareStatement(sqlQuery);
            statement.setBigDecimal(1, account.getBalance());
            statement.setLong(2, account.getId());
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Collection<Account> getAccounts() {
//        Collection<Account> collection = new Hashtable<>();
//        String sqlQuery = "Select "
//        getConnection();
        return null;

    }
}
