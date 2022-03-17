package io.github.naivekyo.bean.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NaiveKyo
 * @version 1.0
 * @description: 测试主类
 * @since 2022/3/16 11:42
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-lookup.xml");
        
        GetBeanTest test = (GetBeanTest) context.getBean("getBeanTest");
        
        test.showMe();
    }
}
