package org.opp.service.impl;

import org.opp.dao.CustomerDao;
import org.opp.service.CustomerService;
import org.opp.util.CommonUtil;

import java.util.Date;

public class CustomerServiceImpl implements CustomerService {




//    public CustomerServiceImpl() {
//        CommonUtil.print("ServiceBean创建");
//    }
//
//    //    private CustomerDao customerDao = new CustomerDaoImpl();
//
//    public static void init(){
//        CommonUtil.print("bean初始化");
//    }
//
//    public static void destroy(){
//        CommonUtil.print("bean销毁");
//    }

//------------------------------------------------------------------------------

    private String driver;
    private Integer port;
    private Date today;
    private CustomerDao dao;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public void setDao(CustomerDao dao) {
        this.dao = dao;
    }

    public void saveCustomer() {
        CommonUtil.print("业务层调用持久层" + " " + driver + " " + port + " " + today  );
        dao.saveCustomer();
    }
}
