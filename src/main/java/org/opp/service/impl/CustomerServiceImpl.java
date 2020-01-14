package org.opp.service.impl;

import org.opp.service.CustomerService;
import org.opp.util.CommonUtil;

public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl() {
        CommonUtil.print("ServiceBean创建");
    }

    //    private CustomerDao customerDao = new CustomerDaoImpl();

    public void saveCustomer() {
        CommonUtil.print("业务层调用持久层");
//        customerDao.saveCustomer();
    }
}
