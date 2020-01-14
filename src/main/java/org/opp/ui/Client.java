package org.opp.ui;

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

        /**
         * 延迟创建bean对象
         **/
//        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//        Resource resource = new ClassPathResource("bean.xml");
//        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
//        CustomerService service = (CustomerService) defaultListableBeanFactory.getBean("customerService");

        /**
         * 立即创建bean对象
         **/
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        /* 调用默认无参构造函数创建 */
//        CustomerService service = (CustomerService) context.getBean("customerService");

        /* 使用静态工厂中的方法创建 */
//        CustomerService service = (CustomerService) context.getBean("staticService");

        /* 使用实例工厂中的方法创建 */
        CustomerService service = (CustomerService) context.getBean("instanceService");

        service.saveCustomer();
    }
}
