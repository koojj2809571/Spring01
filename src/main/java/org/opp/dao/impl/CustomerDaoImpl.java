package org.opp.dao.impl;

import org.opp.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {
    public void saveCustomer() {
        System.out.println("持久层保存了客户");
    }
}
