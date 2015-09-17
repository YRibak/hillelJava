package homework19.dao.factory.xml;


import homework19.dao.factory.AccountDao;
import homework19.dao.factory.CustomerDao;
import homework19.dao.factory.DaoFactory;

/**
 * Created by VSulevskiy on 14.09.2015.
 */
public class XmlDaoFactory extends DaoFactory {
    @Override
    public CustomerDao getCustomerDao() {
        return new XmlCustomerDao();
    }

    @Override
    public AccountDao getAccountDao() {
        return new XmlAccountDao();
    }
}
