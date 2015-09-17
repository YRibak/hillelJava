package homework19.dao.client;

import homework19.dao.businessobjects.Account;
import homework19.dao.businessobjects.Customer;
import homework19.dao.factory.AccountDao;
import homework19.dao.factory.CustomerDao;
import homework19.dao.factory.DaoFactory;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * Created by VSulevskiy on 14.09.2015.
 */
public class App {
    public static void main(String[] args) {

      //  init();

        Account accountOne = new Account(1);
        accountOne.setBalance(BigDecimal.valueOf(10.1));

        Account accountTwo = new Account(2);
        accountTwo.setBalance(BigDecimal.valueOf(100.0));

        Account accountThree = new Account(3);
        accountThree.setBalance(BigDecimal.valueOf(10_000));

        Customer customerOne = new Customer(1, "Ivanov", "Ivan", Arrays.asList(new Account[]{accountOne, accountTwo}));
        Customer customerTwo = new Customer(2, "Petrov", "Peter", Arrays.asList(new Account[]{accountThree}));

        DaoFactory daoFactory = DaoFactory.getDaoFactory(DaoFactory.DataSourceType.RDB);

        AccountDao accountDao = daoFactory.getAccountDao();
        CustomerDao customerDao = daoFactory.getCustomerDao();
        accountDao.insertAccount(accountOne);
        accountDao.insertAccount(accountTwo);
        accountDao.insertAccount(accountThree);

        Account accountGotFromDataSource = accountDao.findAccount(3L);

        accountDao.deleteAccount(accountTwo);

        customerDao.insertCustomer(customerOne);
        customerDao.insertCustomer(customerTwo);
        Customer c = customerDao.findCustomer(1);

    }

    private static void init() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/test",
                    "testUser",
                    "test");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Statement statement = null;
        try {
            statement = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.execute("CREATE SCHEMA test");
            statement.execute("CREATE TABLE test.account" +
                    "(" +
                    "  account_id bigint NOT NULL," +
                    "  balance decimal NOT NULL" +
                    ")");
            statement.execute("CREATE TABLE test.customer" +
                    "(" +
                    "  customer_id bigint NOT NULL," +
                    "  first_name varchar NOT NULL," +
                    "  last_name varchar NOT NULL" +
                    ")");
            statement.execute("CREATE TABLE test.customer_account" +
                    "(" +
                    "  customer_id bigint NOT NULL," +
                    "  account_id bigint NOT NULL" +
                    ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try { if (statement != null) statement.close(); } catch (SQLException e) {
            e.printStackTrace();
        } ;
        try { if (con != null) con.close(); } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
