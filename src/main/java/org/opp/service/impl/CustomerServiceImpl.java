package org.opp.service.impl;

import org.opp.dao.CustomerDao;
import org.opp.dao.impl.CustomerDaoImpl;
import org.opp.factory.BeanFactory;
import org.opp.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

//    private CustomerDao customerDao = new CustomerDaoImpl();
    private CustomerDao customerDao = (CustomerDao) BeanFactory.getBean("CUSTOMER_DAO");

    public void saveCustomer() {
        System.out.println("业务层调用持久层");
        customerDao.saveCustomer();
    }
}
