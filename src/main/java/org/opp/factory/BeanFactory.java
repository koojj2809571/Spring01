package org.opp.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BeanFactory {
//    public static CustomerService getCustomerService() {
//        try {
//            return (CustomerService) Class.forName("org.opp.service.impl.CustomerServiceImpl").newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static CustomerDao getCustomerDao() {
//        try {
//            return (CustomerDao) Class.forName("org.opp.dao.impl.CustomerDaoImpl").newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

//    private static Properties props = new Properties();

//    static {
//        try {
//            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
//            InputStream in = new FileInputStream("src/main/java/org/opp/bean.properties");
//            props.load(in);
//        } catch (Exception e) {
//            throw new ExceptionInInitializerError("读取配置文件失败" + e);
//        }
//    }

//    public static void main(String[] args){
//        System.out.println(props.getProperty("CUSTOMERSERVICE"));
//        System.out.println(BeanFactory.class.getResource("").getPath());
//        System.out.println(BeanFactory.class.getResource("/").getPath());
//        System.out.println(BeanFactory.class.getClassLoader().getResource("").getPath());
//    }

//    -----------------------------------------------------------------------------------------------------------------

    private static ResourceBundle bundle = ResourceBundle.getBundle("bean");

    private static Map<String, Object> beans = new HashMap<String, Object>();

//    static {
//        Enumeration<String> keys = bundle.getKeys();
//        while (keys.hasMoreElements()) {
//
//            try {
//                String key = keys.nextElement();
//                String path = bundle.getString(key);
//                Object bean = Class.forName(path).newInstance();
//                beans.put(key, bean);
//            } catch (Exception e) {
//                throw new ExceptionInInitializerError("创建容器失败" + e);
//            }
//
//        }
//    }

    public static Object getBean(String beanName) {
        return beans.get(beanName);
    }
}
