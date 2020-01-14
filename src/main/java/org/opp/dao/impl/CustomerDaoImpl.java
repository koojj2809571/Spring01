package org.opp.dao.impl;

import org.opp.dao.CustomerDao;
import org.opp.util.CommonUtil;

public class CustomerDaoImpl implements CustomerDao {

    public CustomerDaoImpl() {
        CommonUtil.print("DaoBean创建");
    }

    public void saveCustomer() {
        CommonUtil.print("持久层保存了客户");
    }
}
