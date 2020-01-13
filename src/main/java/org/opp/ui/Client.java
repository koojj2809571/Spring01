package org.opp.ui;

import org.opp.dao.CustomerDao;
import org.opp.factory.BeanFactory;
import org.opp.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

//    自定义工厂模式配置
//    public static void main(String[] args) {
//        CustomerService customerService = (CustomerService) BeanFactory.getBean("CUSTOMER_SERVICE");
//        customerService.saveCustomer();
//    }

//    spring配置
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        CustomerService service = (CustomerService) context.getBean("customerService");
        CustomerDao dao = (CustomerDao) context.getBean("customerDao");

        print(service);
        print(dao);
    }

    public static void print(Object o){
        System.out.println(o);
    }
}
